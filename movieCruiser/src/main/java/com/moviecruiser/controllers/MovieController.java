package com.moviecruiser.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.moviecruiser.entities.Movie;
import com.moviecruiser.service.MovieService;

@Controller
public class MovieController {

	@Autowired
	MovieService movieService;

	@RequestMapping(value = "/Edit-Movie", method = RequestMethod.GET)
	public String showEditMovie(@RequestParam("Id") int movieId, ModelMap model) {
		Movie movie = movieService.getMovie(movieId);
		model.addAttribute("movie", movie);
		return "edit-movie";
	}

	@RequestMapping(value = "/Edit-Movie", method = RequestMethod.POST)
	public String editMovie(@RequestParam("movieId") int movieId, @RequestParam("movie-title") String movieTitle,
			@RequestParam("movie-gross") int movieGross, @RequestParam("movie-active") String movieActive,
			@RequestParam("movie-dateOfLaunch") String movieDateOfLaunch,
			@RequestParam("movie-genre") String movieGenre, @RequestParam("movie-teaser") String movieTeaser) {

		Movie movie = new Movie(movieId, movieTitle, movieGross, movieActive, movieDateOfLaunch, movieGenre,
				movieTeaser);
		movieService.UpdateMovie(movie);
		return "edit-movie-status";
	}

	@RequestMapping(value = "/movies", method = RequestMethod.GET)
	public String loginn(ModelMap model) {

		List<Movie> movies = movieService.getAdminMovieList();

		model.addAttribute("movies", movies);

		return "movie-list-admin";

	}

	@RequestMapping(value = "/fmovies", method = RequestMethod.GET)
	public String loginnn(ModelMap model) {

		List<Movie> fmovies = movieService.getCustomerMovieList();
		model.addAttribute("fmovies", fmovies);
		return "movie-list-customer";

	}

}
