package com.tsr.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.tsr.api.bean.ProductCategory;
import com.tsr.api.bean.ProductGoods;
import com.tsr.api.bean.ProductInfo;
import com.tsr.api.model.SimilarItem;
import com.tsr.api.service.ProductGoodsServiceApi;
import com.tsr.core.data.ProductGoodsDataSet;
import com.tsr.core.data.ProductGoodsItem;
import com.tsr.core.persistence.writer.ProductCategoryMapper;
import com.tsr.core.persistence.writer.ProductGoodsMapper;
import com.tsr.core.persistence.writer.ProductInfoMapper;
import com.tsr.core.recommender.ProductGoodsRecommender;
import com.tsr.core.recommender.Recommender;
import com.tsr.core.similarity.RecommendationType;

public class ProductGoodsServiceImpl implements ProductGoodsServiceApi {
	
	@Resource 
	private ProductInfoMapper productInfoMapper;
	@Resource 
	private ProductGoodsMapper productGoodsMapper;
	@Resource
	private ProductCategoryMapper productCategoryMapper;
	
	private ProductGoodsDataSet dataSet;
	
	private String dataSetLock = "dataSetLock";
	
	private static Logger logger = Logger.getLogger(ProductGoodsServiceImpl.class);
	
	@Override
	public ProductGoods get(Integer productGoodsId) {
		return productGoodsMapper.selectByPrimaryKey(productGoodsId);
	}

	@Override
	public ProductGoods getAllInfo(Integer productGoodsId) {
		ProductGoods productGoods = productGoodsMapper.selectByPrimaryKey(productGoodsId);
		ProductCategory firstProductCategory =productCategoryMapper.selectByCategoryCode(productGoods.getFirstClass());
		ProductCategory secondProductCategory =productCategoryMapper.selectByCategoryCode(productGoods.getSecondClass());
		ProductCategory thirdProductCategory =productCategoryMapper.selectByCategoryCode(productGoods.getThirdClass());
		productGoods.setFirstClassName(firstProductCategory.getCategoryName());
		productGoods.setSecondClassName(secondProductCategory.getCategoryName());
		productGoods.setThirdClassName(thirdProductCategory.getCategoryName());
		ProductInfo productInfo = productInfoMapper.selectByPrimaryKey(productGoods.getProductId());
		productGoods.setProductInfo(productInfo);
		return productGoods;
	}

	@Override
	public List<ProductGoods> getProductGoodsList(ProductGoods productGoods) {
		List<ProductGoods> productGoodsList = productGoodsMapper.selectList(productGoods);
		return productGoodsList;
	}

	@Override
	public List<ProductGoods> recommend(ProductGoods productGoods) {
		List<ProductGoods> resultList = new ArrayList<ProductGoods>();
		try{
			ProductGoodsItem item =  new ProductGoodsItem(productGoods.getProductGoodsId(), productGoods.getPdtName(), productGoods);
			if(dataSet == null){
				synchronized (this.dataSetLock) {
					if(dataSet == null){
						dataSet = new ProductGoodsDataSet();
						dataSet.loadItems();
					}
				}
			}
			Recommender  recommender = new ProductGoodsRecommender(dataSet,RecommendationType.ITEM_CONTENT_BASED);
			SimilarItem[] similarItems = recommender.findSimilarItems(item);
			for(SimilarItem similarItem : similarItems){
				ProductGoods productGoodsRecord = get(similarItem.getItem().getId());
				resultList.add(productGoodsRecord);
			}
		}catch(Exception e){
			logger.error("推荐异常：goods_id:"+productGoods.getProductGoodsId(), e);
		}
		return resultList;
	}
	
	

}
