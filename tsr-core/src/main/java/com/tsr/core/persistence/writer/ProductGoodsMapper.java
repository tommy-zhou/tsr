package com.tsr.core.persistence.writer;

import java.util.List;

import com.tsr.api.bean.ProductGoods;

public interface ProductGoodsMapper {
    int deleteByPrimaryKey(Integer productGoodsId);

    int insert(ProductGoods record);

    int insertSelective(ProductGoods record);

    ProductGoods selectByPrimaryKey(Integer productGoodsId);

    int updateByPrimaryKeySelective(ProductGoods record);

    int updateByPrimaryKey(ProductGoods record);
    
    List<ProductGoods> selectList(ProductGoods record);
}