package com.tsr.core.recommender;

import java.util.ArrayList;
import java.util.List;

import com.tsr.api.model.Dataset;
import com.tsr.api.model.Item;
import com.tsr.api.model.SimilarItem;
import com.tsr.api.model.SimilarUser;
import com.tsr.api.model.User;
import com.tsr.core.data.ProductGoodsDataSet;
import com.tsr.core.similarity.ProductGoodsSimilarityMatrixRepository;
import com.tsr.core.similarity.RecommendationType;
import com.tsr.core.similarity.SimilarityMatrix;

public class ProductGoodsRecommender implements Recommender {

	private RecommendationType type;
	private SimilarityMatrix similarityMatrix;
	private ProductGoodsDataSet dataSet;
	private boolean verbose = true;

	public ProductGoodsRecommender(ProductGoodsDataSet dataSet,
			RecommendationType type) {
		this.type = type;
		boolean useCache = true;
		ProductGoodsSimilarityMatrixRepository smRepo = new ProductGoodsSimilarityMatrixRepository(
				useCache);
		this.similarityMatrix = smRepo.load(this.type, dataSet);
		this.dataSet = dataSet;
	}

	@Override
	public List<PredictedItemRating> recommend(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PredictedItemRating> recommend(User user, int topN) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double predictRating(User user, Item item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SimilarUser[] findSimilarUsers(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SimilarUser[] findSimilarUsers(User user, int topN) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SimilarItem[] findSimilarItems(Item item) {
		return findSimilarItems(item, 5);
	}

	@Override
	public SimilarItem[] findSimilarItems(Item item, int topN) {
		List<SimilarItem> similarItems = new ArrayList<SimilarItem>();

		similarItems = findItemsBasedOnItemSimilarity(item);

		SimilarItem[] topSimilarItems = SimilarItem.getTopSimilarItems(
				similarItems, topN);

		if (verbose) {
			SimilarItem.printItems(topSimilarItems,
					"Items like item " + item.getName() + ":");
		}

		return topSimilarItems;
	}

	private List<SimilarItem> findItemsBasedOnItemSimilarity(Item item) {

		List<SimilarItem> similarItems = new ArrayList<SimilarItem>();

		int itemId = item.getId();

		for (Item sItem : dataSet.getItems()) {

			if (itemId != sItem.getId()) {

				double similarity = similarityMatrix.getValue(itemId,
						sItem.getId());
				if (similarity > 0.0) {
					similarItems.add(new SimilarItem(sItem, similarity));
				}
			}
		}

		return similarItems;
	}

	@Override
	public Dataset getDataset() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getSimilarityThreshold() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSimilarityThreshold(double similarityThreshold) {
		// TODO Auto-generated method stub

	}

}
