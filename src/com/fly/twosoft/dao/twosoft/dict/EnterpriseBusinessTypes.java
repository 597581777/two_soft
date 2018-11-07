package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class EnterpriseBusinessTypes {

	public static Map<Short, String> dict = new HashMap<Short, String>();

	public static final Short COMMON = 1;
	public static final Short INSERT = 2;
	public static final Short INFO = 3;

	static {
		dict.put(COMMON, "软件产品开发销售(营业)收入");
		dict.put(INSERT, "嵌入式软件产品开发销售(营业)收入");
		dict.put(INFO, "信息系统集成产品开发销售(营业)收入");
	}

}
