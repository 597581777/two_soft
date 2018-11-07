package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class ShowStates {

	public static Map<Short, String> dict = new HashMap<Short, String>();

	public static final Short NORMAL = 1;
	public static final Short SHOWED = 2;
	public static final Short CANCED = 3;
	

	static {
		dict.put(NORMAL, "未公示");
		dict.put(SHOWED, "已公示");
		dict.put(CANCED, "已取消");
		
	}

}
