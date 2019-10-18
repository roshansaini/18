package com.moviecruiser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.moviecruiser.dao.MovieDao;
import com.moviecruiser.entities.Movie;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieDao moviedao;
	
	
	
	public MovieServiceImpl() {
		super();
	}


	public MovieServiceImpl(MovieDao moviedao) {
		super();
		this.moviedao = moviedao;
	}

	
	@Override
	@Transactional
	public List<Movie> getAdminMovieList() {
		
		return moviedao.getAdminMovieList();
	}

	
	@Override
	@Transactional
	public List<Movie> getCustomerMovieList() {
		
		return moviedao.getCustomerMovieList();
	}


	@Override
	@Transactional
	public Movie getMovie(int movieId) {
		
		return moviedao.getMovie(movieId);
	}


	@Override
	@Transactional
	public void UpdateMovie(Movie movie) {
		moviedao.UpdateMovie(movie);
		
	}

}
