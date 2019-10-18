package com.cts.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cts.dao.EmpDao;

@Component
public class EmpService {

	@Autowired
	EmpDao empdao;
	
	public EmpService(){
		
	}
	
	// EmpService Constructor to set EmpDao object.
	public EmpService(EmpDao dao){
		super();
		this.empdao=dao;
	}
	
	// Setting a EmpDao object
	public void setDao(EmpDao dao){
		this.empdao=dao;
	}
	 
	// calling the EmpDao method of the EmpDao Class.
	public void call(){
		empdao.Empdao();
	}
}
