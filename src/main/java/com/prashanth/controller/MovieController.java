package com.prashanth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.prashanth.model.Movie;
import com.prashanth.repository.MovieRepositoy;

@RestController
public class MovieController {
	@Autowired
private MovieRepositoy movieRepository;
	
	   @Autowired
	    public MovieController(MovieRepositoy movieRepository) {
	        this.movieRepository = movieRepository;
	    }
	@PostMapping("/post")
	public String SaveMovie(@RequestBody Movie movie) {
		movieRepository.save(movie);
		return "🗳️ 🗳️movie Detailes saved successfully💐  💐";
	}
	@GetMapping("/Get")
	public List<Movie> getAllMovies(@RequestBody Movie movie){
		List<Movie> mv=(List<Movie>) movieRepository.findAll();
		return mv;
		
	}
	@DeleteMapping("/Delete/{movieId}")
	public String DeleteByid(@RequestBody Movie movie,@PathVariable int movieId){
		movieRepository.deleteById(movieId);
		return "💐  💐Movie Deleted💐  💐";
	}
	@PutMapping("/update/{movieId}")
	public String UpdateByMovieId(@RequestBody Movie movie,@PathVariable int movieId) {
		Movie movie1=movieRepository.findById(movieId).get();
		
		//movieRepository.delete(movie1);
         movieRepository.save(movie1);
		return "💐  💐Movie Detailes Updated successfully💐  💐";
	}
	@GetMapping("GetById/{movieId}")
	public Movie GetById(@RequestBody Movie movie,@PathVariable int movieId) {
		Movie movie1=movieRepository.findById(movieId).get();
		return movie1;
	}
//	@GetMapping("GetByName/{movieName}")
//	public Movie GetByMoviename(@RequestBody Movie movie,@PathVariable String movieName) {
//		movieRepository.GetByMovieName(movieName);
//		return movie;
//		
//	}
}
