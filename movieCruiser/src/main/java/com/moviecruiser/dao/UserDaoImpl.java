package com.moviecruiser.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.moviecruiser.entities.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User getUser(String userName, String userPass) {	
	
		Session currentSession = sessionFactory.getCurrentSession();
		String hql = "from com.moviecruiser.entities.User u where u.us_name=:name and u.us_password=:pwd";
		Query<User> query = currentSession.createQuery(hql);
		query.setParameter("name", userName);
		query.setParameter("pwd", userPass);
		
		Object queryResult = query.uniqueResult();
		
		User user = (User) queryResult;
		
		

		return user;
	}
}
