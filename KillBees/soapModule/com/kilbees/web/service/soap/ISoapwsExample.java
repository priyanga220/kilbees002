package com.kilbees.web.service.soap;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.kilbees.bussiness.model.DrugCategory;

@WebService
public interface ISoapwsExample 
{
	public DrugCategory getCategory(@WebParam(name="catid")String catid);
}
