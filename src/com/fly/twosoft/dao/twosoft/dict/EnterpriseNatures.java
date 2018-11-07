package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class EnterpriseNatures {

	public static Map<Short, String> dict = new HashMap<Short, String>();

	public static final Short CHINA = 1;
	public static final Short FOREIGN = 2;
	public static final Short JOINT = 3;
	public static final Short PRIVATET = 4;
	public static final Short OTHER = 5;
	

	static {
		dict.put(CHINA, "国有");
		dict.put(FOREIGN, "外商独资");
		dict.put(JOINT, "中外合资");
		dict.put(PRIVATET, "民营");		
		dict.put(OTHER, "其他");
	}

}
