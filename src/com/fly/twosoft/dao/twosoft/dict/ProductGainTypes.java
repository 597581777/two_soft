package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class ProductGainTypes {
	public static Map<Short, String> dict = new HashMap<Short, String>();

	public static final Short ORIGINAL = 1;
	public static final Short RECEIVE = 2;

	static {
		dict.put(ORIGINAL, "原始");
		dict.put(RECEIVE, "受让");
	}

}
