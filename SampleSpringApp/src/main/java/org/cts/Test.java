package org.cts;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		College college=context.getBean(College.class,"college");
		List<Course> courses=college.getCourses();
		for(Course course:courses){
			System.out.println(course.getId()+"\t"+course.getName()+"\t"+course.getCost());
		}
	}

}
