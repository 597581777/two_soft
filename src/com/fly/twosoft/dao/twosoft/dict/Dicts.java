package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class Dicts {
	
	public final static Map<String, String> dict = new HashMap<String, String>();

	public final static String DETAIL_LINK_MAN = "detaiLinkMan";

	public final static String DETAIL_LINK_PHONE = "detaiLinkPhone";

	public final static String DETAIL_LINK_EMAIL = "detaiLinkEmail";
	
	static{
		dict.put(DETAIL_LINK_MAN, "联系人");
		dict.put(DETAIL_LINK_PHONE, "联系电话");
		dict.put(DETAIL_LINK_EMAIL, "联系邮箱");
	}

}
