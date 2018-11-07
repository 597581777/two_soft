package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class ProductSoftType2s {

	public static Map<Short, String> dict = new HashMap<Short, String>();
	public static Map<Short, String> sysDict = new HashMap<Short, String>();
	public static Map<Short, String> braceDict = new HashMap<Short, String>();
	public static Map<Short, String> appDict = new HashMap<Short, String>();

	public static final Short SYS_OP = 1;
	public static final Short SYS_CHINA = 2;
	public static final Short SYS_NET = 3;
	public static final Short SYS_INSERT = 4;
	public static final Short SYS_OTHER = 5;
	public static final Short BRACE_LANGUAGE = 6;
	public static final Short BRACE_DB = 7;
	public static final Short BRACE_TOOL = 8;
	public static final Short BRACE_NET = 9;
	public static final Short BRACE_MIDDLE = 10;
	public static final Short BRACE_OTHER = 11;
	public static final Short APP_MANAGE = 12;
	public static final Short APP_OFFICE = 13;
	public static final Short APP_DISTINGUISH = 14;
	public static final Short APP_IMG = 15;
	public static final Short APP_CONTROL = 16;
	public static final Short APP_NET = 17;
	public static final Short APP_INFO = 18;
	public static final Short APP_DB = 19;
	public static final Short APP_SECURITY = 20;
	public static final Short APP_INSERT = 21;
	public static final Short APP_TEACH = 22;
	public static final Short APP_GAME = 23;
	public static final Short APP_OTHER = 24;

	static {
		sysDict.put(SYS_OP, "操作系统");
		sysDict.put(SYS_CHINA, "中文处理系统");
		sysDict.put(SYS_NET, "网络系统");
		sysDict.put(SYS_INSERT, "嵌入式操作系统");
		sysDict.put(SYS_OTHER, "其他");
		braceDict.put(BRACE_LANGUAGE, "程序设计语言");
		braceDict.put(BRACE_DB, "数据库系统设计");
		braceDict.put(BRACE_TOOL, "工具软件");
		braceDict.put(BRACE_NET, "网络通信软件");
		braceDict.put(BRACE_MIDDLE, "中间件");
		braceDict.put(BRACE_OTHER, "其他");
		appDict.put(APP_MANAGE, "行业管理软件");
		appDict.put(APP_OFFICE, "办公软件");
		appDict.put(APP_DISTINGUISH, "模式识别软件");
		appDict.put(APP_IMG, "图形图象软件");
		appDict.put(APP_CONTROL, "控制软件");
		appDict.put(APP_NET, "网络应用软件");
		appDict.put(APP_INFO, "信息管理软件");
		appDict.put(APP_DB, "数据库管理应用软件");
		appDict.put(APP_SECURITY, "安全与保密软件");
		appDict.put(APP_INSERT, "嵌入式应用软件");
		appDict.put(APP_TEACH, "教育软件");
		appDict.put(APP_GAME, "游戏软件");
		appDict.put(APP_OTHER, "其他");
		dict.putAll(sysDict);
		dict.putAll(braceDict);
		dict.putAll(appDict);
	}

}
