package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cts.service.EmpService;
@Component
public class EmpController {
	@Autowired
	EmpService service;
	public EmpController(){
		
	}
	public EmpController(EmpService service) {
		super();
		this.service = service;
	}
	public void setController(EmpService service) {
		this.service = service;
	}
	public void call()
	{
		service.call();
	}
}
