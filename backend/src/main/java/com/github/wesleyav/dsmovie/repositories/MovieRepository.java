package com.github.wesleyav.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.wesleyav.dsmovie.entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
