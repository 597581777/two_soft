package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class ProductTypes {

	public static Map<Short, String> dict = new HashMap<Short, String>();

	public static final Short IN = 1;
	public static final Short OUT = 2;

	static {
		dict.put(IN, "国产软件");
		dict.put(OUT, "进口软件");
	}

}
