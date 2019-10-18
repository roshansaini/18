package com.moviecruiser.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.moviecruiser.entities.Movie;

@Repository
public class MovieDaoImpl implements MovieDao {

	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public List<Movie> getAdminMovieList() {

		Session session = sessionFactory.getCurrentSession();
		String hql = "from com.moviecruiser.entities.Movie";
		Query query = session.createQuery(hql);
		List<Movie> movies = query.list();
		for(Movie movie:movies){
			System.out.println(movie);
		}
		return movies;
	}

	@Override
	public List<Movie> getCustomerMovieList() {
		System.out.println("1");
		Session session = sessionFactory.getCurrentSession();
		System.out.println("2");
		String hql = "from com.moviecruiser.entities.Movie where movie_active= :mactive";
		System.out.println("3");
		Query query = session.createQuery(hql).setParameter("mactive", "Yes");
		System.out.println("4");
		List<Movie> fmovies = query.list();
		System.out.println("Favorites");
		for (Movie movie : fmovies) {
			System.out.println(movie);
		}
		
		return fmovies;
	}

	@Override
	public List<Movie> getFavoritesMovieList(int userId) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from com.moviecruiser.entities.Movie where mv_id in (select fv_mv_id from com.moviecruiser.entities.Favorite where fv_us_id=:fv_us_id)";
		Query query = session.createQuery(hql).setParameter("fv_us_id", userId);
		List<Movie> movies = query.list();

		return movies;
	}

	@Override
	public void UpdateMovie(Movie movie) {
		System.out.println("Movie in DAO"+movie);
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(movie);
		System.out.println("Movie Updaetd");
	}

	@Override
	public boolean deleteFavoritesMovie(int fv_id) {
		
		return false;
	}

	@Override
	public boolean insertIntoFavorites(int us_id, int mv_id) {

		return false;
	}

	@Override
	public Movie getMovie(int movieId) {
		Session session = sessionFactory.getCurrentSession();
		Movie movie=session.get(Movie.class ,movieId);
		System.out.println(movie);
		return movie;
	}

}
