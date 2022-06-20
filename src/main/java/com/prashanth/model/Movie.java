package com.prashanth.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import lombok.Data;

@Data
@Entity
public class Movie {
	@Id
	@GeneratedValue
private Integer movieId;
private String movieName;
private String movieLanguage;
private Double movieBudjet;
private String movieReview;
public Movie() {
	
}
public Movie(Integer movieId, String movieName, String movieLanguage, Double movieBudjet, String movieReview) {
	super();
	movieId = movieId;
	this.movieName = movieName;
	this.movieLanguage = movieLanguage;
	this.movieBudjet = movieBudjet;
	this.movieReview = movieReview;
}
public Integer getMovieId() {
	return movieId;
}
public void setMovieId(Integer movieId) {
	movieId = movieId;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public String getMovieLanguage() {
	return movieLanguage;
}
public void setMovieLanguage(String movieLanguage) {
	this.movieLanguage = movieLanguage;
}
public Double getMovieBudjet() {
	return movieBudjet;
}
public void setMovieBudjet(Double movieBudjet) {
	this.movieBudjet = movieBudjet;
}
public String getMovieReview() {
	return movieReview;
}
public void setMovieReview(String movieReview) {
	this.movieReview = movieReview;
}
@Override
public String toString() {
	return "Movie [MovieId=" + movieId + ", movieName=" + movieName + ", movieLanguage=" + movieLanguage
			+ ", movieBudjet=" + movieBudjet + ", movieReview=" + movieReview + "]";
}

}
