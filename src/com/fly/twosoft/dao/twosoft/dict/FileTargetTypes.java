package com.fly.twosoft.dao.twosoft.dict;

import java.util.HashMap;
import java.util.Map;

public class FileTargetTypes {
	public static Map<Short, String> dict = new HashMap<Short, String>();
	public static Map<Short, String> productDict = new HashMap<Short, String>();
	public static Map<Short, String> enterpriseDict = new HashMap<Short, String>();

	public static final Short SHOW_OTHER = 1;
	public static final Short ENTERPRISE_QUICK = 2;
	public static final Short PRODUCT_QUICK = 3;
	public static final Short PRODUCT_APPLY_TABLE = 4;
	public static final Short PRODUCT_TAX = 5;
	public static final Short PRODUCT_LICENCE = 6;
	public static final Short PRODUCT_CHECK_REPORT = 7;
	public static final Short PRODUCT_KNOWLEDGE = 8;
	public static final Short PRODUCT_OTHER = 9;
	public static final Short ENTERPRISE_APPLY = 10;
	public static final Short ENTERPRISE_LICENCE = 11;
	public static final Short ENTERPRISE_LEGAL = 12;
	public static final Short ENTERPRISE_SOFTS = 13;
	public static final Short ENTERPRISE_QUALIFICATION = 14;
	public static final Short ENTERPRISE_PERSON = 15;
	public static final Short ENTERPRISE_MONEY = 16;
	public static final Short ENTERPRISE_PLACE = 17;
	public static final Short ENTERPRISE_QUALITY = 18;
	public static final Short ENTERPRISE_OTHER = 19;

	static {
		dict.put(SHOW_OTHER, "其他类型公示");
		dict.put(ENTERPRISE_QUICK, "企业加急");
		dict.put(PRODUCT_QUICK, "产品加急");
		productDict.put(PRODUCT_APPLY_TABLE, "产品申请表");
		productDict.put(PRODUCT_TAX, "产品税务登记");
		productDict.put(PRODUCT_LICENCE, "产品知识产权");
		productDict.put(PRODUCT_CHECK_REPORT, "产品检测报告");
		productDict.put(PRODUCT_KNOWLEDGE, "产品知识产权");
		productDict.put(PRODUCT_OTHER, "产品其他");
		enterpriseDict.put(ENTERPRISE_APPLY, "软件企业评估申请书");
		enterpriseDict.put(ENTERPRISE_LICENCE, "企业法人营业执照副本");
		enterpriseDict.put(ENTERPRISE_LEGAL, "企业法人承诺书");
		enterpriseDict.put(ENTERPRISE_SOFTS, "软件列表");
		enterpriseDict.put(ENTERPRISE_QUALIFICATION, "企业企业资质相关文件");
		enterpriseDict.put(ENTERPRISE_PERSON, "职员相关资料");
		enterpriseDict.put(ENTERPRISE_MONEY, "财务相关资料");
		enterpriseDict.put(ENTERPRISE_PLACE, "办公场所相关资料");
		enterpriseDict.put(ENTERPRISE_QUALITY, "产品质量相关资料");
		enterpriseDict.put(ENTERPRISE_OTHER, "其他相关资料");
		
		dict.putAll(productDict);
		dict.putAll(enterpriseDict);
	}

}
