package com.tsr.core.persistence;

import com.tsr.api.bean.ProductInventoryStock;

public interface ProductInventoryStockMapper {
    int deleteByPrimaryKey(Integer inventoryStockId);

    int insert(ProductInventoryStock record);

    int insertSelective(ProductInventoryStock record);

    ProductInventoryStock selectByPrimaryKey(Integer inventoryStockId);

    int updateByPrimaryKeySelective(ProductInventoryStock record);

    int updateByPrimaryKey(ProductInventoryStock record);
}