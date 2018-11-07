package com.fly.twosoft.dao.twosoft.multi.model;

import com.fly.twosoft.dao.twosoft.single.model.TsProduct;

public class TsMProduct extends TsProduct {

	/**
	 * TsMProduct.java limaoshan 2017 下午4:26:47
	 */
	private static final long serialVersionUID = 5606696278643642203L;

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
