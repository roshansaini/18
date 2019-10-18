package com.moviecruiser.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.moviecruiser.entities.Movie;

@Repository
public class FavoriteDaoImpl implements FavoriteDao {

	@Override
	public List<Movie> getFavorite(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteFavorite(int userId, int movieId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addFavorite(int userId, int movieId) {
		// TODO Auto-generated method stub
		
	}

}
