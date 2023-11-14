package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.entities.Match;

public interface MatchService {
	
	List<Match> getAllMatches();
	List<Match> getLiveMatches();
	List<List<String>>  getpointtable();

}
