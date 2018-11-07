package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class EnterpriseProducts {

	public static Map<Short, String> dict = new HashMap<Short, String>();

	public static final Short BASE = 1;
	public static final Short BRACE = 2;
	public static final Short APP = 3;
	public static final Short INSERT = 4;
	public static final Short SECURITY = 5;
	public static final Short CUSTOM = 6;
	public static final Short INTEGRATE = 7;
	public static final Short ASK = 8;
	public static final Short STORE = 9;
	public static final Short OTHER = 10;

	static {
		dict.put(BASE, "基础软件");
		dict.put(BRACE, "支撑软件");
		dict.put(APP, "应用软件");
		dict.put(INSERT, "嵌入式应用软件");
		dict.put(SECURITY, "信息安全软件");
		dict.put(CUSTOM, "软件定制服务");
		dict.put(INTEGRATE, "信息系统集成服务");
		dict.put(ASK, "信息技术咨询服务");
		dict.put(STORE, "数据处理和存储服务");
		dict.put(OTHER, "其他");
	}

}
