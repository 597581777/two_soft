package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class VerifyStates {

	public static Map<Short, String> dict = new HashMap<Short, String>();

	public static Map<Short, String> passedDict = new HashMap<Short, String>();
	
	public static Map<Short, String> verifyDict = new HashMap<Short, String>();

	public static final Short DRAFT = 1;
	public static final Short APPLY = 2;
	public static final Short PASSED = 3;
	public static final Short REFUSED = 4;
	

	static {
		dict.put(DRAFT, "草稿");
		dict.put(APPLY, "待审核");
		dict.put(PASSED, "通过");
		dict.put(REFUSED, "不通过");
		
		passedDict.put(PASSED, "通过");
		
		verifyDict.put(APPLY, "待审核");
		verifyDict.put(PASSED, "通过");
		verifyDict.put(REFUSED, "不通过");
		
	}

}
