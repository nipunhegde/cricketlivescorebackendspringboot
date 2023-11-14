package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Match;
import com.example.demo.service.MatchService;

@RestController
@RequestMapping("/match")
public class MatchController {

	
	@Autowired
	private MatchService mservice;
	
	@GetMapping("/live")
	public ResponseEntity<List<Match>> getall(){
		return new ResponseEntity<List<Match>>(this.mservice.getLiveMatches(),HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<Match>> getallmatch(){
		return new ResponseEntity<List<Match>>(this.mservice.getAllMatches(),HttpStatus.OK);
	}
	@GetMapping("/points")
	public ResponseEntity<?> getallpoints(){
		return new ResponseEntity<>(this.mservice.getpointtable(),HttpStatus.OK);
	}
}
