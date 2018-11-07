package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class EnterpriseHardwareTypes {

	public static Map<Short, String> dict = new HashMap<Short, String>();

	public static final Short TYPE_MACHINE = 1;
	public static final Short SERVER = 2;
	public static final Short PC = 3;
	public static final Short EXCHANGE = 4;
	public static final Short ROUTER = 5;

	static {
		dict.put(TYPE_MACHINE, "大/中/小型机");
		dict.put(SERVER, "服务器");
		dict.put(PC, "PC机");
		dict.put(EXCHANGE, "交换机");
		dict.put(ROUTER, "路由器");
	}

}
