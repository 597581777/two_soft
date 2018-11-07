package com.fly.twosoft.utils;

import com.fly.core.exception.FlyTransactionException;

public class TsMethods {

	public static String genCodePrefix(int i) {
		if (i >= 26936)
			throw new FlyTransactionException("不能大于等于26936");
		StringBuilder builder = new StringBuilder();
		if (i < 2600) {
			char c = (char) ('A' + (i / 100));
			builder.append(c);
			String str = (i % 100) + "";
			if (str.length() == 1)
				builder.append("0");
			builder.append(str);
		} else if (i < 9360) {
			i = i - 2600;
			char c = (char) ('A' + (i / 260));
			builder.append(c);
			c = (char) ('A' + (i % 260 / 10));
			builder.append(c);
			String str = (i % 260 % 10) + "";
			builder.append(str);
		} else if (i < 26936) {
			i = i - 9360;
			char c = (char) ('A' + (i / 676));
			builder.append(c);
			c = (char) ('A' + (i % 676 / 26));
			builder.append(c);
			c = (char) ('A' + (i % 676 % 26));
			builder.append(c);
		}
		return builder.toString();
	}
}
