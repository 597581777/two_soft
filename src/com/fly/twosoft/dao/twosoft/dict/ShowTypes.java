package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class ShowTypes {

	public static Map<Short, String> dict = new HashMap<Short, String>();

	public static final Short ENTERPRISE = 1;
	public static final Short PRODUCT = 2;

	static {
		dict.put(ENTERPRISE, "企业");
		dict.put(PRODUCT, "产品");
	}

}
