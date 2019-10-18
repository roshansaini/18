package org.cts.dao;

import java.util.List;

import org.cts.entities.Emp;

public interface EmpDao {
	void insert(Emp e);
	Emp get(int id);
	void delete(Emp e);
	List<Emp> getEmployees();
}
