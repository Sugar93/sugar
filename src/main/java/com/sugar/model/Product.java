package com.sugar.model;

import java.util.Date;

public class Product {
    private Long productId;

    private String productName;

    private String productType;

    private Double productPrice;

    private Integer productSales;

    private String productPic;

    private String productOutline;

    private Byte stock;

    private Date createDt;

    private Date updateDt;

    private Byte deleted;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductSales() {
        return productSales;
    }

    public void setProductSales(Integer productSales) {
        this.productSales = productSales;
    }

    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic == null ? null : productPic.trim();
    }

    public String getProductOutline() {
        return productOutline;
    }

    public void setProductOutline(String productOutline) {
        this.productOutline = productOutline == null ? null : productOutline.trim();
    }

    public Byte getStock() {
        return stock;
    }

    public void setStock(Byte stock) {
        this.stock = stock;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public Date getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(Date updateDt) {
        this.updateDt = updateDt;
    }

    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }
}