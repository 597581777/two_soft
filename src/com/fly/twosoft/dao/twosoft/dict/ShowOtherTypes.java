package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class ShowOtherTypes {
	public static Map<Short, String> dict = new HashMap<Short, String>();

	public static final Short TEMP = 1;
	public static final Short OP = 2;
	public static final Short POLICY = 3;

	static {
		dict.put(TEMP, "临时通知");
		dict.put(OP, "操作指南");
		dict.put(POLICY, "政策法规");
	}

}
