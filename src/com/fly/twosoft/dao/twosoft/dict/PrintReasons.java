package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class PrintReasons {

	public static Map<Short, String> dict = new HashMap<Short, String>();

	public static final Short WRONG = 1;
	public static final Short REPRINT = 2;
	public static final Short OTHER = 3;

	static {
		dict.put(WRONG, "打印信息错误");
		dict.put(REPRINT, "证书补打");
		dict.put(OTHER , "其他");
	}

}
