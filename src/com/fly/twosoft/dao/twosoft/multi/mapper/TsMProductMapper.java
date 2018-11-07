package com.fly.twosoft.dao.twosoft.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fly.twosoft.dao.twosoft.multi.model.TsMProduct;
import com.fly.twosoft.dao.twosoft.single.model.TsProduct;
import com.fly.twosoft.dao.twosoft.single.model.TsProductExample;

public interface TsMProductMapper {

	int updateByExampleSelectiveNull(@Param("record") TsProduct record,
			@Param("example") TsProductExample example);
	
	List<TsMProduct> selectOrgIdAndCount(TsProductExample example);
	
	List<TsMProduct> selectOrgIdYearCount(TsProductExample example);

}
