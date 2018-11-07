package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class Passes2 {

	public static Map<Short, String> dict = new HashMap<Short, String>();

	public static final Short PASSED = 1;
	public static final Short NOT = 2;

	static {
		dict.put(PASSED, "通过");
		dict.put(NOT, "不通过");
	}

}
