package com.tsr.api.bean;

import java.util.Date;

public class ProductInventoryStock {
    private Integer inventoryStockId;

    private Integer productId;

    private Integer productGoodsId;

    private Integer qty;

    private Integer realQty;

    private Integer lockQty;

    private Integer isInStock;

    private Byte backorders;

    private Integer notifyStockQty;

    private Byte isSynchronization;

    private Date createDatetime;

    private String createOperator;

    private Date updateDatetime;

    private String updateOperator;

    private Integer safeQty;

    public Integer getInventoryStockId() {
        return inventoryStockId;
    }

    public void setInventoryStockId(Integer inventoryStockId) {
        this.inventoryStockId = inventoryStockId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductGoodsId() {
        return productGoodsId;
    }

    public void setProductGoodsId(Integer productGoodsId) {
        this.productGoodsId = productGoodsId;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Integer getRealQty() {
        return realQty;
    }

    public void setRealQty(Integer realQty) {
        this.realQty = realQty;
    }

    public Integer getLockQty() {
        return lockQty;
    }

    public void setLockQty(Integer lockQty) {
        this.lockQty = lockQty;
    }

    public Integer getIsInStock() {
        return isInStock;
    }

    public void setIsInStock(Integer isInStock) {
        this.isInStock = isInStock;
    }

    public Byte getBackorders() {
        return backorders;
    }

    public void setBackorders(Byte backorders) {
        this.backorders = backorders;
    }

    public Integer getNotifyStockQty() {
        return notifyStockQty;
    }

    public void setNotifyStockQty(Integer notifyStockQty) {
        this.notifyStockQty = notifyStockQty;
    }

    public Byte getIsSynchronization() {
        return isSynchronization;
    }

    public void setIsSynchronization(Byte isSynchronization) {
        this.isSynchronization = isSynchronization;
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

    public Integer getSafeQty() {
        return safeQty;
    }

    public void setSafeQty(Integer safeQty) {
        this.safeQty = safeQty;
    }
}