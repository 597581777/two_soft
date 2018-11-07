package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class EnterpriseSoftTypes {

	public static Map<Short, String> dict = new HashMap<Short, String>();

	public static final Short DEVELOP_TEST = 1;
	public static final Short OP = 2;
	public static final Short DB = 3;
	public static final Short NET = 4;
	public static final Short OTHER = 5;

	static {
		dict.put(DEVELOP_TEST, "开发和测试工具");
		dict.put(OP, "操作系统");
		dict.put(DB, "数据库系统");
		dict.put(NET, "网络系统");
		dict.put(OTHER, "其他");
	}

}
