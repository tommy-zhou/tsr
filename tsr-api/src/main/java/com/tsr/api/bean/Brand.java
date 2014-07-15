package com.tsr.api.bean;

import java.util.Date;

public class Brand {
    private Integer brandId;

    private String brandName;

    private Byte brandState;

    private String brandIndex;

    private Integer monthSalesCount;

    private String createOperator;

    private String updateOperator;

    private Date createDatetime;

    private Date updateDatetime;

    private String brandStory;

    private String brandLogoUrl;

    private Integer brandSort;

    private String brandTitleUrl;

    private String brandImgUrl;

    private String brandIntro;

    private Byte synStatus;

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

    public Byte getBrandState() {
        return brandState;
    }

    public void setBrandState(Byte brandState) {
        this.brandState = brandState;
    }

    public String getBrandIndex() {
        return brandIndex;
    }

    public void setBrandIndex(String brandIndex) {
        this.brandIndex = brandIndex == null ? null : brandIndex.trim();
    }

    public Integer getMonthSalesCount() {
        return monthSalesCount;
    }

    public void setMonthSalesCount(Integer monthSalesCount) {
        this.monthSalesCount = monthSalesCount;
    }

    public String getCreateOperator() {
        return createOperator;
    }

    public void setCreateOperator(String createOperator) {
        this.createOperator = createOperator == null ? null : createOperator.trim();
    }

    public String getUpdateOperator() {
        return updateOperator;
    }

    public void setUpdateOperator(String updateOperator) {
        this.updateOperator = updateOperator == null ? null : updateOperator.trim();
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public String getBrandStory() {
        return brandStory;
    }

    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory == null ? null : brandStory.trim();
    }

    public String getBrandLogoUrl() {
        return brandLogoUrl;
    }

    public void setBrandLogoUrl(String brandLogoUrl) {
        this.brandLogoUrl = brandLogoUrl == null ? null : brandLogoUrl.trim();
    }

    public Integer getBrandSort() {
        return brandSort;
    }

    public void setBrandSort(Integer brandSort) {
        this.brandSort = brandSort;
    }

    public String getBrandTitleUrl() {
        return brandTitleUrl;
    }

    public void setBrandTitleUrl(String brandTitleUrl) {
        this.brandTitleUrl = brandTitleUrl == null ? null : brandTitleUrl.trim();
    }

    public String getBrandImgUrl() {
        return brandImgUrl;
    }

    public void setBrandImgUrl(String brandImgUrl) {
        this.brandImgUrl = brandImgUrl == null ? null : brandImgUrl.trim();
    }

    public String getBrandIntro() {
        return brandIntro;
    }

    public void setBrandIntro(String brandIntro) {
        this.brandIntro = brandIntro == null ? null : brandIntro.trim();
    }

    public Byte getSynStatus() {
        return synStatus;
    }

    public void setSynStatus(Byte synStatus) {
        this.synStatus = synStatus;
    }
}