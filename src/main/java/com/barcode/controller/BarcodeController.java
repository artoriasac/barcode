package com.barcode.controller;

import com.barcode.model.BarcodeModel;
import com.barcode.service.BarcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:artorias
 * @Description:
 * @Date:create in 9:04 2018/7/30 0030
 * Modeified By:
 */
@RestController
public class BarcodeController {
    @Autowired
    private BarcodeService barcodeService;


    @PostMapping("barcode")
    public void barcodeTest(@RequestBody BarcodeModel barcodeModel){
        barcodeService.getInfo(barcodeModel);
    }

}
