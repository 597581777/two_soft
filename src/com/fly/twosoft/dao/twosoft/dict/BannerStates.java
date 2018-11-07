package com.fly.twosoft.dao.twosoft.dict;

import java.util.LinkedHashMap;
import java.util.Map;

public class BannerStates {
	public static final Map<Short, String> dict = new LinkedHashMap<Short, String>();
	public static final Short START = 1;
	public static final Short STOP = 2;

	static {
		dict.put(START, "启用");
		dict.put(STOP, "停用");
	}

}
