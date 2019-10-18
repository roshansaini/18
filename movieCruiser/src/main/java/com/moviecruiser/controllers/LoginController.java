package com.moviecruiser.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.moviecruiser.entities.Movie;
import com.moviecruiser.entities.User;
import com.moviecruiser.service.MovieService;
import com.moviecruiser.service.UserService;

@Controller
@SessionAttributes("userid")
public class LoginController {

	@Autowired
	UserService userService;

	@Autowired
	MovieService movieService;

	public LoginController(UserService userService) {
		super();
		this.userService = userService;
	}

	@RequestMapping("/")
	public String showLogin() {
		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("userName") String username, @RequestParam("userPass") String password,
			ModelMap model) {
		String viewName = "";
		String msg = "";
		User user = userService.getUser(username, password);
		if (user.getUs_category().equals("Admin")) {
			List<Movie> movies = movieService.getAdminMovieList();
			viewName = "movie-list-admin";
			model.addAttribute("movies", movies);
			for (Movie movie : movies) {
				System.out.println(movie);
			}
		} else if (user.getUs_category().equals("Customer")) {
			model.addAttribute("userid", user.getUs_id());
			List<Movie> fmovies = movieService.getCustomerMovieList();
			model.addAttribute("fmovies", fmovies);
			System.out.println("Passing movies");
			for (Movie movie : fmovies) {
				System.out.println(movie);
			}
			viewName = "movie-list-customer";
		} else {
			msg = msg + "Invalid Credentials";
			viewName = "index";
		}
		model.addAttribute("msg", msg);
		return viewName;

	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String login(HttpServletRequest request, ModelMap model) {
		String msg = "You have been Successfully logout.";
		model.addAttribute("msg", msg);
		request.removeAttribute("userid");
		return "index";

	}

	/*
	 * @RequestMapping(value = "/Edit-Movie", method = RequestMethod.GET) public
	 * String showEditMovie() {
	 * 
	 * return "edit-movie"; }
	 * 
	 * @RequestMapping(value = "/Edit-Movie", method = RequestMethod.POST)
	 * public String editMovie(@RequestParam("Id") int movieId, ModelMap model)
	 * { List<Movie> movies = movieService.getAdminMovieList();
	 * model.addAttribute("movies", movies); return "edit-movie-status"; }
	 */

}
