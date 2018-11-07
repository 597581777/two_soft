package com.fly.twosoft.dao.twosoft.multi.model;

import com.fly.twosoft.dao.twosoft.single.model.TsEnterprise;

public class TsMEnterprise extends TsEnterprise {

	/**
	 * TsMEnterprise.java limaoshan 2017 下午3:44:38
	 */
	private static final long serialVersionUID = -5540032166752191331L;

	private Integer count;
	private Integer year;

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

}
