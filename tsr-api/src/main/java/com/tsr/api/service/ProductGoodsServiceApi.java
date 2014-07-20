package com.tsr.api.service;

import java.util.List;

import com.tsr.api.bean.ProductGoods;

public interface ProductGoodsServiceApi {
	
	public ProductGoods get(Integer productGoodsId);
	
	public ProductGoods getAllInfo(Integer productGoodsId);
	
	public List<ProductGoods> getProductGoodsList(ProductGoods productGoods);
	
	public List<ProductGoods> recommend(ProductGoods productGoods);
}
