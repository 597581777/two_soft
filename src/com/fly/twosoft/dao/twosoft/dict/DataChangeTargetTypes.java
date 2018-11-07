package com.fly.twosoft.dao.twosoft.dict;

import java.util.LinkedHashMap;
import java.util.Map;

public class DataChangeTargetTypes {
	
	public static final Map<Short, String> dict = new LinkedHashMap<Short, String>();
	public static final Short ENTERPRISE = 1;
	public static final Short PRODUCT = 2;

	static {
		dict.put(ENTERPRISE, "企业");
		dict.put(PRODUCT, "产品");
	}

}
