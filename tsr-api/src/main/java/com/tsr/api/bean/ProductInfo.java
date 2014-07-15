package com.tsr.api.bean;

import java.util.Date;

public class ProductInfo {
    private Integer productId;

    private String productName;

    private String productSecondName;

    private Integer supplierId;

    private String supplierName;

    private Integer brandId;

    private String brandName;

    private Integer categoryId;

    private String firstClass;

    private String thirdClass;

    private String secondClass;

    private String metaKeywords;

    private String metaDescription;

    private String metaTitle;

    private Byte saleStatus;

    private Date onsaleStartDatetime;

    private Date onsaleEndDatetime;

    private String roomType;

    private Byte isDelete;

    private Byte isVisable;

    private String firstAttrCode;

    private String secondAttrCode;

    private Byte isPoints;

    private Integer isInStock;

    private Byte publishStatus;

    private Date createDatetime;

    private String createOperator;

    private Date updateDatetime;

    private String updateOperator;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductSecondName() {
        return productSecondName;
    }

    public void setProductSecondName(String productSecondName) {
        this.productSecondName = productSecondName == null ? null : productSecondName.trim();
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getFirstClass() {
        return firstClass;
    }

    public void setFirstClass(String firstClass) {
        this.firstClass = firstClass == null ? null : firstClass.trim();
    }

    public String getThirdClass() {
        return thirdClass;
    }

    public void setThirdClass(String thirdClass) {
        this.thirdClass = thirdClass == null ? null : thirdClass.trim();
    }

    public String getSecondClass() {
        return secondClass;
    }

    public void setSecondClass(String secondClass) {
        this.secondClass = secondClass == null ? null : secondClass.trim();
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords == null ? null : metaKeywords.trim();
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription == null ? null : metaDescription.trim();
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle == null ? null : metaTitle.trim();
    }

    public Byte getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(Byte saleStatus) {
        this.saleStatus = saleStatus;
    }

    public Date getOnsaleStartDatetime() {
        return onsaleStartDatetime;
    }

    public void setOnsaleStartDatetime(Date onsaleStartDatetime) {
        this.onsaleStartDatetime = onsaleStartDatetime;
    }

    public Date getOnsaleEndDatetime() {
        return onsaleEndDatetime;
    }

    public void setOnsaleEndDatetime(Date onsaleEndDatetime) {
        this.onsaleEndDatetime = onsaleEndDatetime;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType == null ? null : roomType.trim();
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Byte getIsVisable() {
        return isVisable;
    }

    public void setIsVisable(Byte isVisable) {
        this.isVisable = isVisable;
    }

    public String getFirstAttrCode() {
        return firstAttrCode;
    }

    public void setFirstAttrCode(String firstAttrCode) {
        this.firstAttrCode = firstAttrCode == null ? null : firstAttrCode.trim();
    }

    public String getSecondAttrCode() {
        return secondAttrCode;
    }

    public void setSecondAttrCode(String secondAttrCode) {
        this.secondAttrCode = secondAttrCode == null ? null : secondAttrCode.trim();
    }

    public Byte getIsPoints() {
        return isPoints;
    }

    public void setIsPoints(Byte isPoints) {
        this.isPoints = isPoints;
    }

    public Integer getIsInStock() {
        return isInStock;
    }

    public void setIsInStock(Integer isInStock) {
        this.isInStock = isInStock;
    }

    public Byte getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Byte publishStatus) {
        this.publishStatus = publishStatus;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getCreateOperator() {
        return createOperator;
    }

    public void setCreateOperator(String createOperator) {
        this.createOperator = createOperator == null ? null : createOperator.trim();
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public String getUpdateOperator() {
        return updateOperator;
    }

    public void setUpdateOperator(String updateOperator) {
        this.updateOperator = updateOperator == null ? null : updateOperator.trim();
    }
}