package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class QuickStates {

	public static Map<Short, String> dict = new HashMap<Short, String>();

	public static final Short NORMAL = 1;
	public static final Short APPLY = 2;
	public static final Short PASSED = 3;
	public static final Short REFUSED = 4;

	static {
		dict.put(NORMAL, "未申请");
		dict.put(APPLY, "申请中");
		dict.put(PASSED, "已通过");
		dict.put(REFUSED, "未通过");
	}

}
