package com.barcode.model;

public class Product {
    private String productType;

    private String productName;

    private String productCode;

    private String productColor;

    private String productDisplaySize;

    private String productInfo;

    private String productWeight;

    private String productPackSize;

    private String productPn;

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor == null ? null : productColor.trim();
    }

    public String getProductDisplaySize() {
        return productDisplaySize;
    }

    public void setProductDisplaySize(String productDisplaySize) {
        this.productDisplaySize = productDisplaySize == null ? null : productDisplaySize.trim();
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo == null ? null : productInfo.trim();
    }

    public String getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(String productWeight) {
        this.productWeight = productWeight == null ? null : productWeight.trim();
    }

    public String getProductPackSize() {
        return productPackSize;
    }

    public void setProductPackSize(String productPackSize) {
        this.productPackSize = productPackSize == null ? null : productPackSize.trim();
    }

    public String getProductPn() {
        return productPn;
    }

    public void setProductPn(String productPn) {
        this.productPn = productPn == null ? null : productPn.trim();
    }
}