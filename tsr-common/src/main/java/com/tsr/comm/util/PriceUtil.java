package com.tsr.comm.util;

public class PriceUtil {
	public static final String[] priceIn = { "[0-800]", "[800-2000]", "[2000-5000]",
			"[5000-10000]", "[10000]" };

	/**
	 * 价格区间判断
	 * 
	 * @param d
	 *            价格
	 * @return
	 */
	public static int priceIn(Double d) {
		if (d == null || d < 0) {
			return 0;
		}
		if (d > 0 && d < 800) {
			return 1;
		} else if (d >= 800 && d < 2000) {
			return 2;
		} else if (d >= 2000 && d < 5000) {
			return 3;
		} else if (d >= 5000 && d < 10000) {
			return 4;
		} else {
			return 5;
		}

	}
}
