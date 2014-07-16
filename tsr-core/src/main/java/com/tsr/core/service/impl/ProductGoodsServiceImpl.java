package com.tsr.core.service.impl;

import javax.annotation.Resource;

import com.tsr.api.bean.ProductGoods;
import com.tsr.api.service.ProductGoodsServiceApi;
import com.tsr.core.persistence.writer.ProductGoodsMapper;

public class ProductGoodsServiceImpl implements ProductGoodsServiceApi {
	
	@Resource 
	private ProductGoodsMapper productGoodsMapper;
	
	@Override
	public ProductGoods get(Integer productGoodsId) {
		return productGoodsMapper.selectByPrimaryKey(productGoodsId);
	}

	@Override
	public ProductGoods getAllInfo(Integer productGoodsId) {
		return productGoodsMapper.selectByPrimaryKey(productGoodsId);
	}

}
