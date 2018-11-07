package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class ProductSoftTypes {

	public static Map<Short, String> dict = new HashMap<Short, String>();

	public static final Short SYS = 1;
	public static final Short BRACE = 2;
	public static final Short APP = 3;
	public static final Short INT = 4;
	public static final Short INF = 5;
	public static final Short  QIAN= 6;
	public static final Short INFSOFT = 7;
	public static final Short  INTF= 8;
	public static final Short OTHER = 9;

	static {
		dict.put(SYS, "系统软件");
		dict.put(BRACE, "支持软件");
		dict.put(APP, "应用软件");
		dict.put(INT, "计算机软件产品");
		dict.put(INF, "信息系统");
		dict.put(QIAN, "嵌入式软件产品");
		dict.put(INFSOFT, "信息系统软件");
		dict.put(INTF, "计算机软件产品/信息系统");
		dict.put(OTHER, "其他");
	}

}
