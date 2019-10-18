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
public class FavoriteController {
	
	@Autowired
	MovieService movieService;

	@RequestMapping(value = "/Add-To-Favorite", method = RequestMethod.GET)
	public String loginn(@RequestParam("Id") String movieId,ModelMap model) {
		
			List<Movie> fmovies=movieService.getCustomerMovieList();
		
			model.addAttribute("fmovies", fmovies);
			
		return "movie-list-customer-notification";

	}
}
