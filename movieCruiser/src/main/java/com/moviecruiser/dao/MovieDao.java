package com.moviecruiser.dao;

import java.util.List;

import com.moviecruiser.entities.Movie;

public interface MovieDao {
	
	public List<Movie> getCustomerMovieList();
	
	public List<Movie> getAdminMovieList();

	public List<Movie> getFavoritesMovieList(int userId);

	public void UpdateMovie(Movie movie);

	public boolean deleteFavoritesMovie(int fv_id);
	
	public boolean insertIntoFavorites(int us_id, int mv_id);
	
	public Movie getMovie(int movieId);

}
