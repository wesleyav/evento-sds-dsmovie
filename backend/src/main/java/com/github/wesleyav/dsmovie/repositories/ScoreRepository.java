package com.github.wesleyav.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.wesleyav.dsmovie.entities.Score;
import com.github.wesleyav.dsmovie.entities.ScorePK;

@Repository
public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
