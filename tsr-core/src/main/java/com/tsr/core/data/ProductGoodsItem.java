package com.tsr.core.data;

import java.util.ArrayList;

import com.tsr.api.bean.ProductGoods;
import com.tsr.api.model.Item;
import com.tsr.api.model.Rating;

public class ProductGoodsItem extends Item {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ProductGoods productGoods = null;
	
	public ProductGoodsItem(Integer id, String name,ProductGoods productGoods) {
        super(id, name, new ArrayList<Rating>(3));
        this.setProductGoods(productGoods); 
    }

	public ProductGoods getProductGoods() {
		return productGoods;
	}

	public void setProductGoods(ProductGoods productGoods) {
		this.productGoods = productGoods;
	}

}
