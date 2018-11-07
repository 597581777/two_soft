package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class Passes {

	public static Map<Short, String> dict = new HashMap<Short, String>();

	public static final Short NOT = 1;
	public static final Short GOING = 2;
	public static final Short PASSED = 3;

	static {
		dict.put(NOT, "未进行");
		dict.put(GOING, "正申报");
		dict.put(PASSED, "通过");
	}

}
