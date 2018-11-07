package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class ProductSoftSizes {
	public static Map<Short, String> dict = new HashMap<Short, String>();

	public static final Short LARGE = 1;
	public static final Short MIDDLE = 2;
	public static final Short SMALL = 3;

	static {
		dict.put(LARGE, "大");
		dict.put(MIDDLE, "中");
		dict.put(SMALL, "小");
	}
}
