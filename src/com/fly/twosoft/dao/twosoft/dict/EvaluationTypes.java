package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class EvaluationTypes {

	public static Map<Short, String> dict = new HashMap<Short, String>();
	
	public static final Short CONSTRUCTION = 1;
	public static final Short MODEL = 2;

	static {
		dict.put(CONSTRUCTION, "信用中国建设企业");
		dict.put(MODEL, "信用中国示范企业");
	}

}
