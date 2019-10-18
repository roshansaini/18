package org.cts;

import java.util.List;

public class College {
	private List<Course> courses;
	public College(){
		
	}
	public College(List<Course> courses) {
		super();
		this.courses = courses;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
}	
