package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class EnterpriseCreditTypes {

	public static Map<Short, String> dict = new HashMap<Short, String>();

	public static final Short CREAT = 1;
	public static final Short EXAMPLE = 2;
	

	static {
		dict.put(CREAT, "信用中国建设企业");
		dict.put(EXAMPLE, "信用中国示范企业");
	}

}
