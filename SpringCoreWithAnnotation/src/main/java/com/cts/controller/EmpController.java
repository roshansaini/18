package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cts.sevice.EmpService;

@Component
public class EmpController {

	@Autowired
	EmpService empservice;

	public EmpController() {
		
	}

	// Constructor to set EmpService Object
	public EmpController(EmpService empservice) {
		super();
		this.empservice = empservice;
	}
	
	// setting EmpService object of EmpService Class
	public void setController(EmpService empservice) {
		this.empservice = empservice;
	}
	
	// calling callDao function of EmpService Class
	public void callService(){
		empservice.call();
	}
}
