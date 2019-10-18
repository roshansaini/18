package com.moviecruiser.dao;

import com.moviecruiser.entities.User;

public interface UserDao {

	public User getUser(String userName,String userPass);
}
