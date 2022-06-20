package com.prashanth.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.prashanth.model.Movie;
@Repository
public interface MovieRepositoy extends JpaRepository<Movie,Integer>{

}
