package com.kilbees.hibernate.idao;

import java.util.List;
import java.util.Map;

import com.kilbees.bussiness.model.DomainDefault;

public interface IAbstractDAO 
{
	
	public List<? extends DomainDefault> retrieveByQuaryString(String queryString);
	public List<? extends DomainDefault> searchByQuaryStringWithLimit(String sql,Map<String,Object> parameterMap, int start, int max);

	public int getDataSize(String quary,Map<String,Object> parameterMap);

}
