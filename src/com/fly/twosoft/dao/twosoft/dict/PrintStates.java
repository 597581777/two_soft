package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class PrintStates {

	public static Map<Short, String> dict = new HashMap<Short, String>();

	public static final Short NORMAL = 1;
	public static final Short PRINTED = 2;

	static {
		dict.put(NORMAL, "未打印");
		dict.put(PRINTED, "已打印");
	}

}
