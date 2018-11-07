package com.fly.twosoft.dao.twosoft.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fly.twosoft.dao.twosoft.multi.model.TsMEnterprise;
import com.fly.twosoft.dao.twosoft.single.model.TsEnterprise;
import com.fly.twosoft.dao.twosoft.single.model.TsEnterpriseExample;

public interface TsMEnterpriseMapper {

	int updateByExampleSelectiveNull(@Param("record") TsEnterprise record,
			@Param("example") TsEnterpriseExample example);
	
	List<TsMEnterprise> selectOrgIdAndCount(TsEnterpriseExample example);
	
	List<TsMEnterprise> selectOrgIdYearCount(TsEnterpriseExample example);
	
	List<TsMEnterprise> selectYearCountMoney(TsEnterpriseExample example);
	
	List<TsMEnterprise> selectOrgIdAndCountMoney(TsEnterpriseExample example);

}
