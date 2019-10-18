package org.cts.main;

import org.cts.dao.EmpDaoImpl;
import org.cts.entities.Emp;

public class Test {

	
	public static void main(String[] args) {
	
	EmpDaoImpl epl=new EmpDaoImpl();
	
	Emp e=new Emp(5,"Roshan","Bangalore");
	epl.insert(e);
		
	}

}
