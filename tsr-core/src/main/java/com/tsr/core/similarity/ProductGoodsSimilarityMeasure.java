package com.tsr.core.similarity;

import java.math.BigDecimal;

import com.tsr.api.bean.ProductGoods;
import com.tsr.comm.constants.AttributeRatioConstants;
import com.tsr.comm.util.PriceUtil;
import com.tsr.comm.util.TermFrequencyUtil;
import com.tsr.core.data.ProductGoodsItem;

public class ProductGoodsSimilarityMeasure {

	public static double calculate(ProductGoodsItem itemA,
			ProductGoodsItem itemB) {
		double score = calculateCategory(itemA.getProductGoods()
				.getThirdClass(), itemB.getProductGoods().getThirdClass())
				* AttributeRatioConstants.CATEGORY_RATIO
				+ calculateName(itemA.getProductGoods().getPdtName(), itemB
						.getProductGoods().getPdtName())
				* AttributeRatioConstants.NAME_RATIO
				+ calculateDetail(itemA.getProductGoods().getPdtDname(), itemB
						.getProductGoods().getPdtDname())
				* AttributeRatioConstants.DETAIL_RATIO
				+ calculateBrand(itemA.getProductGoods().getBrandName(), itemB
						.getProductGoods().getBrandName())
				* AttributeRatioConstants.BRAND_RATIO
				+ calculateModel(itemA.getProductGoods().getPdtModel(), itemB
						.getProductGoods().getPdtModel())
				* AttributeRatioConstants.MODEL_RATIO
				+ calculateSize(itemA.getProductGoods().getSize(), itemB
						.getProductGoods().getSize())
				* AttributeRatioConstants.SIZE_RATIO
				+ calculateColor(itemA.getProductGoods().getColor(), itemB
						.getProductGoods().getColor())
				* AttributeRatioConstants.COLOR_RATIO
				+ calculateRoomType(itemA.getProductGoods().getRoomType(),
						itemB.getProductGoods().getRoomType())
				* AttributeRatioConstants.ROOMTYPE_RATIO
				+ calculatePrice(itemA.getProductGoods().getReferencePrice(),
						itemB.getProductGoods().getReferencePrice())
				* AttributeRatioConstants.PRICE_RATIO
				+ calculateStyle(itemA.getProductGoods().getStyle(), itemB
						.getProductGoods().getStyle())
				* AttributeRatioConstants.STYLE_RATIO
				+ calculateOrigin(itemA.getProductGoods().getOrigin(), itemB
						.getProductGoods().getOrigin())
				* AttributeRatioConstants.ORIGIN_RATIO
				+ calculateBreakable(itemA.getProductGoods().getBreakable(),
						itemB.getProductGoods().getBreakable())
				* AttributeRatioConstants.BREAKABLE_RATIO
				+ calculateExpressDelivery(itemA.getProductGoods()
						.getExpressDelivery(), itemB.getProductGoods()
						.getExpressDelivery())
				* AttributeRatioConstants.EXPRESSDELIVERY_RATIO
				+ calculatePackageStyle(itemA.getProductGoods()
						.getPackageStyle(), itemB.getProductGoods()
						.getPackageStyle())
				* AttributeRatioConstants.PACKAGESTYLE_RATIO;

		return score;
	}

	public static double calculateCategory(String cateCodeA, String cateCodeB) {
		double score = 0d;
		if (cateCodeA != null && cateCodeB != null) {
			if (cateCodeA.equalsIgnoreCase(cateCodeB)) {
				score = 1d;
			} else if (cateCodeA.substring(0, 6).equalsIgnoreCase(
					cateCodeB.substring(0, 6))) {
				score = 0.6d;
			} else if (cateCodeA.substring(0, 3).equalsIgnoreCase(
					cateCodeB.substring(0, 3))) {
				score = 0.3d;
			}
		}
		return score;
	}

	public static double calculateName(String nameA, String nameB) {
		return TermFrequencyUtil.compareText(nameA, nameB);
	}

	public static double calculateDetail(String detailA, String detailB) {
		return TermFrequencyUtil.compareText(detailA, detailB);
	}

	public static double calculateBrand(String brandA, String brandB) {
		if (brandA != null && brandA.equalsIgnoreCase(brandB)) {
			return 1d;
		}
		return 0d;
	}

	public static double calculateModel(String modelA, String modelB) {
		if (modelA != null && modelA.equalsIgnoreCase(modelB)) {
			return 1d;
		}
		return 0d;
	}

	public static double calculateSize(String sizeA, String sizeB) {
		if (sizeA != null && sizeA.equalsIgnoreCase(sizeB)) {
			return 1d;
		}
		return 0d;
	}

	public static double calculateColor(String colorA, String colorB) {
		if (colorA != null && colorA.equalsIgnoreCase(colorB)) {
			return 1d;
		}
		return 0d;
	}

	public static double calculateRoomType(String roomTypeA, String roomTypeB) {
		if (roomTypeA != null && roomTypeA.equalsIgnoreCase(roomTypeB)) {
			return 1d;
		}
		return 0d;
	}

	public static double calculatePrice(BigDecimal priceA, BigDecimal priceB) {
		if (priceA == null || priceB == null) {
			return 0.0d;
		}
		int p1 = PriceUtil.priceIn(priceA.doubleValue());
		int p2 = PriceUtil.priceIn(priceB.doubleValue());
		if (p1 == p2) {
			return 1.0d;
		} else if (Math.abs(p1 - p2) == 100) {
			return 0.5d;
		} else {
			return 0.0d;
		}
	}

	public static double calculateStyle(String styleA, String styleB) {
		if (styleA != null && styleA.equalsIgnoreCase(styleB)) {
			return 1d;
		}
		return 0d;
	}

	public static double calculateOrigin(String originA, String originB) {
		if (originA != null && originA.equalsIgnoreCase(originB)) {
			return 1d;
		}
		return 0d;
	}

	public static double calculateBreakable(String breakableA, String breakableB) {
		if (breakableA != null && breakableA.equalsIgnoreCase(breakableB)) {
			return 1d;
		}
		return 0d;
	}

	public static double calculateExpressDelivery(String expressDeliveryA,
			String expressDeliveryB) {
		if (expressDeliveryA != null
				&& expressDeliveryA.equalsIgnoreCase(expressDeliveryB)) {
			return 1d;
		}
		return 0d;
	}

	public static double calculatePackageStyle(String packageStyleA,
			String packageStyleB) {
		if (packageStyleA != null
				&& packageStyleA.equalsIgnoreCase(packageStyleB)) {
			return 1d;
		}
		return 0d;
	}

	public static void main(String[] args) {
		ProductGoods productGoods = new ProductGoods();
		ProductGoodsItem itemA = new ProductGoodsItem(1, "1", productGoods);
		ProductGoodsItem itemB = new ProductGoodsItem(1, "1", productGoods);
		System.out.println(calculate(itemA, itemB));
	}
}
