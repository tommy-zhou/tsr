package com.tsr.core.data;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.tsr.api.bean.ProductGoods;
import com.tsr.api.model.Rating;
import com.tsr.api.model.User;
import com.tsr.api.service.ProductGoodsServiceApi;
import com.tsr.comm.util.SpringUtils;

public class ProductGoodsDataSet{
    /*
     * Map of all items.
     */
    private Map<Integer, ProductGoodsItem> allItems = new HashMap<Integer, ProductGoodsItem>();
    
    private String name ;
    
    public ProductGoodsDataSet(){
    	name = getClass().getSimpleName();
    }
    
    public ProductGoodsDataSet(String name){
    	this.name = name;
    }
    
	
	public int getRatingsCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public int getUserCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public int getItemCount() {
		 return allItems.size();
	}

	
	public Collection<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public  Collection<ProductGoodsItem> getItems() {
		return allItems.values();
	}
	
	
	public User getUser(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ProductGoodsItem getItem(Integer itemId) {
		return allItems.get(itemId);
	}

	
	public Collection<Rating> getRatings() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public double getAverageItemRating(int itemId) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public double getAverageUserRating(int userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public String getName() {
		return name;
	}

	
	public boolean isIdMappingRequired() {
		return true;
	}

	
	public String[] getAllTerms() {
		// TODO Auto-generated method stub
		return null;
	}

	public void loadItems(){
        ProductGoodsServiceApi productGoodsService = (ProductGoodsServiceApi)SpringUtils.getBean("productGoodsService");
        
        ProductGoods record = new ProductGoods();
		Byte saleStatus = 1;
		record.setSaleStatus(saleStatus);
        List<ProductGoods> productGoodsList = productGoodsService.getProductGoodsList(record);
        
		for(ProductGoods goods : productGoodsList){
			ProductGoodsItem item = new ProductGoodsItem(goods.getProductGoodsId(), goods.getPdtDname(), goods);
			allItems.put(goods.getProductGoodsId(), item);
		}
	}

}
