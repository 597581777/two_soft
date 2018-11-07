package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class ProductHardwares {

	public static Map<Short, String> dict = new HashMap<Short, String>();

	public static final Short SOFT = 1;
	public static final Short LIGHT = 2;
	public static final Short SOUND = 3;
	public static final Short SHOW = 4;
	public static final Short OTHER = 5;

	static {
		dict.put(SOFT, "软驱");
		dict.put(LIGHT, "光驱");
		dict.put(SOUND, "声卡");
		dict.put(SHOW, "显示卡");
		dict.put(OTHER, "其他");
	}

}
