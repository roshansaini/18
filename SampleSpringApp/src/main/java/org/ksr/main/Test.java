package org.ksr.main;

import org.ksr.Emp;
import org.ksr.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Emp e=context.getBean(Emp.class);
		System.out.println(e.getEno()+"\t"+e.getName());
		
	}

}
