package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class EnterpriseStaffStockTypes {

	public static Map<Short, String> dict = new HashMap<Short, String>();

	public static final Short MANAGER = 1;
	public static final Short TECHNOLOGY = 2;
	public static final Short OTHER = 3;

	static {
		dict.put(MANAGER, "管理人员");
		dict.put(TECHNOLOGY, "技术人员");
		dict.put(OTHER, "其他员工");
	}

}
