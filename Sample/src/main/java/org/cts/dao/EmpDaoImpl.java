package org.cts.dao;

import java.util.List;

import org.cts.entities.Emp;
import org.cts.util.DBUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpDaoImpl implements EmpDao {
	
	@Override
	public void insert(Emp e) {
		Session session=DBUtil.getSession();
		Transaction transaction=session.beginTransaction();
		session.save(e);
		transaction.commit();
		session.close();
	}

	@Override
	public Emp get(int id) {
		Session session=DBUtil.getSession();
		Transaction transaction=session.beginTransaction();
		Emp e=session.get(Emp.class,id);
		transaction.commit();
		session.close();
		return e;
	}

	@Override
	public void delete(Emp e) {
		Session session=DBUtil.getSession();
		Transaction transaction=session.beginTransaction();
		session.delete("Emp",e);
		transaction.commit();
		session.close();

	}

	@Override
	public List<Emp> getEmployees() {
		Session session=DBUtil.getSession();
		Query query=session.createQuery("select * from org.cts.entites.Emp");
		List<Emp> emps=query.list();
		session.close();
		return emps;
	}

}
