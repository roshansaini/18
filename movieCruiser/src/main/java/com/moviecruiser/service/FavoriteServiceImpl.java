package com.moviecruiser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.moviecruiser.dao.FavoriteDao;
import com.moviecruiser.entities.Movie;

@Service
public class FavoriteServiceImpl implements FavoriteService{

	
	@Autowired
	FavoriteDao favoriteDao;
	
		
	public FavoriteServiceImpl() {
		super();
	}

	public FavoriteServiceImpl(FavoriteDao favoriteDao) {
		super();
		this.favoriteDao = favoriteDao;
	}
	
	@Override
	@Transactional
	public List<Movie> getFavorite(int userId) {

		return favoriteDao.getFavorite(userId);
	}

	@Override
	@Transactional
	public void deleteFavorite(int userId, int movieId) {
		favoriteDao.deleteFavorite(userId, movieId);
		
	}

	@Override
	@Transactional
	public void addFavorite(int userId, int movieId) {
		favoriteDao.addFavorite(userId, movieId);
		
	}

}
