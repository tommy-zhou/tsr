package com.tsr.core.similarity;



import com.tsr.api.model.Item;
import com.tsr.core.data.ProductGoodsDataSet;
import com.tsr.core.data.ProductGoodsItem;


/**
 * Similarity between items based on the content associated with items. 
 */
public class ProductGoodsItemContentBasedSimilarity 
    extends BaseSimilarityMatrix {
    
    /**
	 * SVUID
	 */
	private static final long serialVersionUID = -2807190886025734879L;

	public ProductGoodsItemContentBasedSimilarity(String id, ProductGoodsDataSet ds) {
        this.id = id;
        this.useObjIdToIndexMapping = ds.isIdMappingRequired();
        calculate(ds);        
    }
    
    
   // @Override
    protected void calculate(ProductGoodsDataSet dataSet) {
        int nItems = dataSet.getItemCount();
        
        similarityValues = new double[nItems][nItems];
        
        // if we want to use mapping from itemId to index then generate 
        // index for every itemId
        if( useObjIdToIndexMapping ) {
            for(Item item : dataSet.getItems() ) {
                idMapping.getIndex(String.valueOf(item.getId()));
            }
        }
        
//        CosineSimilarityMeasure cosineMeasure = new CosineSimilarityMeasure();
        //String[] allTerms = dataSet.getAllTerms();
        
        
        for (int u = 0; u < nItems; u++) {
            
            int itemAId = getObjIdFromIndex(u);
            ProductGoodsItem itemA = dataSet.getItem(itemAId);
            
            // we only need to calculate elements above the main diagonal.
            for (int v = u + 1; v < nItems; v++) {
           
                int itemBId = getObjIdFromIndex(v);
                ProductGoodsItem itemB = dataSet.getItem(itemBId);

//                similarityValues[u][v] = cosineMeasure.calculate(
//                        itemA.getItemContent().getTermVector(allTerms), 
//                        itemB.getItemContent().getTermVector(allTerms));
                similarityValues[u][v] = ProductGoodsSimilarityMeasure.calculate(itemA, itemB);
            }

            // for u == v assign 1
            similarityValues[u][u] = 1.0;
            
        }
    }

}
