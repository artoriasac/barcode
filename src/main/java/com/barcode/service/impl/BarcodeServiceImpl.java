package com.barcode.service.impl;

import com.barcode.mapper.ProductMapper;
import com.barcode.model.BarcodeModel;
import com.barcode.model.Product;
import com.barcode.service.BarcodeService;
import com.common.utils.BarcodeUtil;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import com.aliyun.oss.OSSClient;
import sun.misc.BASE64Encoder;

import static com.common.utils.BarcodeUtil.generateFile;

/**
 * @Author:artorias
 * @Description:
 * @Date:create in 9:05 2018/7/30 0030
 * Modeified By:
 */
@Service
public class BarcodeServiceImpl implements BarcodeService {

    @Autowired
    private ProductMapper productMapper;

    private static final String M2CRW="M2CRW";

    private static final String M2CRP="M2CRP";

    private static final String M2AG="M2AG";

    private static final String M2AB="M2AB";

    private static final String M2DBB="M2DBB";

    private static final String M2DBC="M2DBC";

    private static final String M2DBD="M2DBD";

    private static final String EXCLE_PATH="D:/qrCode.xls";

    private static final  String ACCESS_KEY_ID="LTAIBm52LvjIDVdO";

    private static final String ACCESS_KEY_SECRET="ad8DyJ8hnE1Lr33NfcDN2NoX2wkMpd";

    private static final String ROLE_ARN="acs:ram::1452872783221063:role/ipasoncn";

    private static final String BUCKET_NAME="psqrcode";

    private static final String ENDPOINT="http://oss-cn-hangzhou.aliyuncs.com";

    private static final  String ROLE_SESSION_NAME="qrCode";

    private static final String REGION="oss-cn-shanghai";

    private static final String PNG_TYPE=".png";

    private static final String DOC_TYPE=".doc";

    private static final String CODE_TYPE="UTF-8";

    private static final String BAR_CODE="barCode";

    private static final  Configuration configuration=new Configuration(Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS);

    private static final     BASE64Encoder encoder=new BASE64Encoder();

    static {

        configuration.setDefaultEncoding(CODE_TYPE);
    }


    @Override
    public void getInfo(BarcodeModel barcodeModel) {
        String barcode = barcodeModel.getBarcode();
        if (barcode==null||barcode.isEmpty()){
            return;
        }
        System.out.println(barcodeModel.getBarcode());
        String[] barcodes = barcode.split("-");
        String barcodeType = barcodes[0];
        String code = barcodes[1];
        String year = "20"+code.substring(3, 5);
        String month = code.substring(5, 7);
        String day = code.substring(7, 9);
        String createTime=year+"."+month+"."+day;
        Map<String, String> dataMap = productMapper.dataMap(barcodeType);
        ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
        BarcodeUtil.generate(barcode,outputStream);
        String img = encoder.encode(outputStream.toByteArray());
        dataMap.put(BAR_CODE,barcode);
        dataMap.put("img",img);
        dataMap.put("createTime",createTime);
        markFreemarker(dataMap);
    }

    public static String upload(ByteArrayOutputStream outputStream, String type){
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(outputStream.toByteArray());
        OSSClient ossClient = new OSSClient(ENDPOINT, ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        // 上传文件流。
        String key = UUID.randomUUID().toString();
        key+=type;
        ossClient.putObject(BUCKET_NAME, key, byteArrayInputStream);
        // 关闭OSSClient。
        ossClient.shutdown();
        String url="https://psqrcode.oss-cn-hangzhou.aliyuncs.com/"+key;
        return url;
    }

    public void markFreemarker(Map<String,String> dataMap){
        ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
        configuration.setClassForTemplateLoading(this.getClass(), "/freemarker");
        try {
            Template template = configuration.getTemplate("barCode.ftl");
            OutputStreamWriter outputStreamWriter=new OutputStreamWriter(outputStream,CODE_TYPE);
            Writer writer=new BufferedWriter(outputStreamWriter);
            template.process(dataMap,writer);
            String url = upload(outputStream, DOC_TYPE);
            System.out.println(url);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
