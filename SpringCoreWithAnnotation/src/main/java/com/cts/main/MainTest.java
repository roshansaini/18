package com.cts.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.config.AppConfig;
import com.cts.controller.EmpController;


public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		EmpController empController=context.getBean(EmpController.class);
		empController.callService();

	}

}
