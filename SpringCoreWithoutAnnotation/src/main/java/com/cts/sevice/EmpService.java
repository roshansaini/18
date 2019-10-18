package com.cts.sevice;

import com.cts.dao.EmpDao;

public class EmpService {

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
