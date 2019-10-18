package com.moviecruiser.dao;

import java.util.List;

import com.moviecruiser.entities.Movie;

public interface FavoriteDao {

	public List<Movie> getFavorite(int userId);
	
	public void deleteFavorite(int userId,int movieId);
	
	public void addFavorite(int userId,int movieId);
}
