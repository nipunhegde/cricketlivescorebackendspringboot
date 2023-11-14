package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Match;

public interface MatchRepo extends JpaRepository<Match, Integer> {
	
	Optional<Match> findByTeamHeading (String teamHeading);

}
