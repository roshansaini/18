package com.cts.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.cts"})
public class AppConfig {
/*
	@Bean
	public EmpDao getDao(){
		EmpDao empdao=new EmpDao();
		return empdao;
	}
	@Bean
	public EmpService getService(){
		EmpService empservice=new EmpService();
		empservice.setDao(getDao());
		return empservice;
	}
	@Bean
	public EmpController getController(){
		EmpController empcontroller=new EmpController();
		empcontroller.setController(getService());
		return empcontroller;
	}
	
*/
}
