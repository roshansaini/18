package com.cts.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cts.dao.EmpDao;
@Component
public class EmpService {
	@Autowired
	EmpDao dao;
	public EmpService()
	{
		
	}
	public EmpService(EmpDao dao) {
		super();
		this.dao = dao;
	}
	public void setDao(EmpDao dao) {
		this.dao = dao;
	}
	public void call()
	{
		dao.dao();
	}
	
}
