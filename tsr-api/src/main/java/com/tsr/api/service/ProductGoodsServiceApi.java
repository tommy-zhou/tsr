package com.tsr.api.service;

import com.tsr.api.bean.ProductGoods;

public interface ProductGoodsServiceApi {
	
	public ProductGoods get(Integer productGoodsId);
	
	public ProductGoods getAllInfo(Integer productGoodsId);
	
}
