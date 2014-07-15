package com.tsr.api.bean;

import java.math.BigDecimal;
import java.util.Date;

public class ProductGoods {
    private Integer productGoodsId;

    private Integer productId;

    private String pdtCode;

    private String pdtModel;

    private String pdtName;

    private String pdtDname;

    private String pdtEname;

    private Integer supplierId;

    private String supplierName;

    private String brandId;

    private String brandName;

    private Integer categoryId;

    private String firstClass;

    private String thirdClass;

    private String secondClass;

    private String barcode;

    private String manufatureCode;

    private String boxCode;

    private String color;

    private String size;

    private String texture;

    private String style;

    private String origin;

    private String packageStyle;

    private BigDecimal taxRate;

    private String unitId;

    private BigDecimal length;

    private BigDecimal width;

    private BigDecimal height;

    private BigDecimal volume;

    private BigDecimal weight;

    private BigDecimal pLength;

    private BigDecimal pWidth;

    private BigDecimal pHeight;

    private BigDecimal pVolume;

    private BigDecimal pWeight;

    private Integer pqty;

    private String breakable;

    private String washable;

    private String coverable;

    private Integer saleRegion;

    private String durationPeriod;

    private String shipPeriod;

    private String customCycle;

    private String maintainDesc;

    private String unpacking;

    private String minOrderAmount;

    private String maxBearing;

    private String expressDelivery;

    private BigDecimal marketPrice;

    private BigDecimal minSalePrice;

    private BigDecimal referenceCost;

    private BigDecimal referencePrice;

    private BigDecimal specialPrice;

    private Date specialFromDate;

    private Date specialToDate;

    private Byte handleType;

    private String handleSupplierId;

    private Byte saleStatus;

    private Date onsaleStartDatetime;

    private Date onsaleEndDatetime;

    private Byte isDelete;

    private String memo;

    private Byte synStatus;

    private String roomType;

    private Byte isVisable;

    private Byte isPoints;

    private Integer pointsCost;

    private Integer isInStock;

    private Byte publishStatus;

    private String goodsImgUrl;

    private String purchaseName;

    private Integer salesCount;

    private Date createDatetime;

    private String createOperator;

    private Date updateDatetime;

    private String updateOperator;

    private String namePrefix;

    private String nameSuffix;

    private Integer elementCnt;

    public Integer getProductGoodsId() {
        return productGoodsId;
    }

    public void setProductGoodsId(Integer productGoodsId) {
        this.productGoodsId = productGoodsId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getPdtCode() {
        return pdtCode;
    }

    public void setPdtCode(String pdtCode) {
        this.pdtCode = pdtCode == null ? null : pdtCode.trim();
    }

    public String getPdtModel() {
        return pdtModel;
    }

    public void setPdtModel(String pdtModel) {
        this.pdtModel = pdtModel == null ? null : pdtModel.trim();
    }

    public String getPdtName() {
        return pdtName;
    }

    public void setPdtName(String pdtName) {
        this.pdtName = pdtName == null ? null : pdtName.trim();
    }

    public String getPdtDname() {
        return pdtDname;
    }

    public void setPdtDname(String pdtDname) {
        this.pdtDname = pdtDname == null ? null : pdtDname.trim();
    }

    public String getPdtEname() {
        return pdtEname;
    }

    public void setPdtEname(String pdtEname) {
        this.pdtEname = pdtEname == null ? null : pdtEname.trim();
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

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId == null ? null : brandId.trim();
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

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public String getManufatureCode() {
        return manufatureCode;
    }

    public void setManufatureCode(String manufatureCode) {
        this.manufatureCode = manufatureCode == null ? null : manufatureCode.trim();
    }

    public String getBoxCode() {
        return boxCode;
    }

    public void setBoxCode(String boxCode) {
        this.boxCode = boxCode == null ? null : boxCode.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture == null ? null : texture.trim();
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public String getPackageStyle() {
        return packageStyle;
    }

    public void setPackageStyle(String packageStyle) {
        this.packageStyle = packageStyle == null ? null : packageStyle.trim();
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId == null ? null : unitId.trim();
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getpLength() {
        return pLength;
    }

    public void setpLength(BigDecimal pLength) {
        this.pLength = pLength;
    }

    public BigDecimal getpWidth() {
        return pWidth;
    }

    public void setpWidth(BigDecimal pWidth) {
        this.pWidth = pWidth;
    }

    public BigDecimal getpHeight() {
        return pHeight;
    }

    public void setpHeight(BigDecimal pHeight) {
        this.pHeight = pHeight;
    }

    public BigDecimal getpVolume() {
        return pVolume;
    }

    public void setpVolume(BigDecimal pVolume) {
        this.pVolume = pVolume;
    }

    public BigDecimal getpWeight() {
        return pWeight;
    }

    public void setpWeight(BigDecimal pWeight) {
        this.pWeight = pWeight;
    }

    public Integer getPqty() {
        return pqty;
    }

    public void setPqty(Integer pqty) {
        this.pqty = pqty;
    }

    public String getBreakable() {
        return breakable;
    }

    public void setBreakable(String breakable) {
        this.breakable = breakable == null ? null : breakable.trim();
    }

    public String getWashable() {
        return washable;
    }

    public void setWashable(String washable) {
        this.washable = washable == null ? null : washable.trim();
    }

    public String getCoverable() {
        return coverable;
    }

    public void setCoverable(String coverable) {
        this.coverable = coverable == null ? null : coverable.trim();
    }

    public Integer getSaleRegion() {
        return saleRegion;
    }

    public void setSaleRegion(Integer saleRegion) {
        this.saleRegion = saleRegion;
    }

    public String getDurationPeriod() {
        return durationPeriod;
    }

    public void setDurationPeriod(String durationPeriod) {
        this.durationPeriod = durationPeriod == null ? null : durationPeriod.trim();
    }

    public String getShipPeriod() {
        return shipPeriod;
    }

    public void setShipPeriod(String shipPeriod) {
        this.shipPeriod = shipPeriod == null ? null : shipPeriod.trim();
    }

    public String getCustomCycle() {
        return customCycle;
    }

    public void setCustomCycle(String customCycle) {
        this.customCycle = customCycle == null ? null : customCycle.trim();
    }

    public String getMaintainDesc() {
        return maintainDesc;
    }

    public void setMaintainDesc(String maintainDesc) {
        this.maintainDesc = maintainDesc == null ? null : maintainDesc.trim();
    }

    public String getUnpacking() {
        return unpacking;
    }

    public void setUnpacking(String unpacking) {
        this.unpacking = unpacking == null ? null : unpacking.trim();
    }

    public String getMinOrderAmount() {
        return minOrderAmount;
    }

    public void setMinOrderAmount(String minOrderAmount) {
        this.minOrderAmount = minOrderAmount == null ? null : minOrderAmount.trim();
    }

    public String getMaxBearing() {
        return maxBearing;
    }

    public void setMaxBearing(String maxBearing) {
        this.maxBearing = maxBearing == null ? null : maxBearing.trim();
    }

    public String getExpressDelivery() {
        return expressDelivery;
    }

    public void setExpressDelivery(String expressDelivery) {
        this.expressDelivery = expressDelivery == null ? null : expressDelivery.trim();
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getMinSalePrice() {
        return minSalePrice;
    }

    public void setMinSalePrice(BigDecimal minSalePrice) {
        this.minSalePrice = minSalePrice;
    }

    public BigDecimal getReferenceCost() {
        return referenceCost;
    }

    public void setReferenceCost(BigDecimal referenceCost) {
        this.referenceCost = referenceCost;
    }

    public BigDecimal getReferencePrice() {
        return referencePrice;
    }

    public void setReferencePrice(BigDecimal referencePrice) {
        this.referencePrice = referencePrice;
    }

    public BigDecimal getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(BigDecimal specialPrice) {
        this.specialPrice = specialPrice;
    }

    public Date getSpecialFromDate() {
        return specialFromDate;
    }

    public void setSpecialFromDate(Date specialFromDate) {
        this.specialFromDate = specialFromDate;
    }

    public Date getSpecialToDate() {
        return specialToDate;
    }

    public void setSpecialToDate(Date specialToDate) {
        this.specialToDate = specialToDate;
    }

    public Byte getHandleType() {
        return handleType;
    }

    public void setHandleType(Byte handleType) {
        this.handleType = handleType;
    }

    public String getHandleSupplierId() {
        return handleSupplierId;
    }

    public void setHandleSupplierId(String handleSupplierId) {
        this.handleSupplierId = handleSupplierId == null ? null : handleSupplierId.trim();
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

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Byte getSynStatus() {
        return synStatus;
    }

    public void setSynStatus(Byte synStatus) {
        this.synStatus = synStatus;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType == null ? null : roomType.trim();
    }

    public Byte getIsVisable() {
        return isVisable;
    }

    public void setIsVisable(Byte isVisable) {
        this.isVisable = isVisable;
    }

    public Byte getIsPoints() {
        return isPoints;
    }

    public void setIsPoints(Byte isPoints) {
        this.isPoints = isPoints;
    }

    public Integer getPointsCost() {
        return pointsCost;
    }

    public void setPointsCost(Integer pointsCost) {
        this.pointsCost = pointsCost;
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

    public String getGoodsImgUrl() {
        return goodsImgUrl;
    }

    public void setGoodsImgUrl(String goodsImgUrl) {
        this.goodsImgUrl = goodsImgUrl == null ? null : goodsImgUrl.trim();
    }

    public String getPurchaseName() {
        return purchaseName;
    }

    public void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName == null ? null : purchaseName.trim();
    }

    public Integer getSalesCount() {
        return salesCount;
    }

    public void setSalesCount(Integer salesCount) {
        this.salesCount = salesCount;
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

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix == null ? null : namePrefix.trim();
    }

    public String getNameSuffix() {
        return nameSuffix;
    }

    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix == null ? null : nameSuffix.trim();
    }

    public Integer getElementCnt() {
        return elementCnt;
    }

    public void setElementCnt(Integer elementCnt) {
        this.elementCnt = elementCnt;
    }
}