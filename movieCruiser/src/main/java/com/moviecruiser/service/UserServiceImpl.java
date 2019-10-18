package com.moviecruiser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.moviecruiser.dao.UserDao;
import com.moviecruiser.entities.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userdao;
	
	public UserServiceImpl() {
				
	}
	
	
	public UserServiceImpl(UserDao userdao) {
		super();
		this.userdao = userdao;
	}



	@Override
	@Transactional
	public User getUser(String userName,String userPass) {
		
		return userdao.getUser(userName,userPass);
	}

}
