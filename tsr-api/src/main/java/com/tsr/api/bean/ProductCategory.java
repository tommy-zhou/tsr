package com.tsr.api.bean;

import java.util.Date;

public class ProductCategory {
    private Integer categoryId;

    private String categoryCode;

    private Integer categoryParentId;

    private String categoryParentCode;

    private String categoryName;

    private Integer status;

    private Integer sequenceNumber;

    private String disabledReason;

    private Date disabledDate;

    private String disabledOperator;

    private Date createDatetime;

    private String createOperator;

    private Date updateDatetime;

    private String updateOperator;

    private Byte synStatus;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode == null ? null : categoryCode.trim();
    }

    public Integer getCategoryParentId() {
        return categoryParentId;
    }

    public void setCategoryParentId(Integer categoryParentId) {
        this.categoryParentId = categoryParentId;
    }

    public String getCategoryParentCode() {
        return categoryParentCode;
    }

    public void setCategoryParentCode(String categoryParentCode) {
        this.categoryParentCode = categoryParentCode == null ? null : categoryParentCode.trim();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getDisabledReason() {
        return disabledReason;
    }

    public void setDisabledReason(String disabledReason) {
        this.disabledReason = disabledReason == null ? null : disabledReason.trim();
    }

    public Date getDisabledDate() {
        return disabledDate;
    }

    public void setDisabledDate(Date disabledDate) {
        this.disabledDate = disabledDate;
    }

    public String getDisabledOperator() {
        return disabledOperator;
    }

    public void setDisabledOperator(String disabledOperator) {
        this.disabledOperator = disabledOperator == null ? null : disabledOperator.trim();
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

    public Byte getSynStatus() {
        return synStatus;
    }

    public void setSynStatus(Byte synStatus) {
        this.synStatus = synStatus;
    }
}