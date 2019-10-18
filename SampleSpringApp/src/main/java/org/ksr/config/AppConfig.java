package org.ksr.config;

import org.ksr.Emp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"org.ksr"})
public class AppConfig {
	@Value("1")
	int eno;
	@Value("suresh")
	String name;
	@Value("chennai")
	String address;
	@Bean
	public Emp getEmp()
	{
		Emp e=new Emp();
		e.setEno(eno);
		e.setName(name);
		e.setAddress(address);
		return e;
	}
}
