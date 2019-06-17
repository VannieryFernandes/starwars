package com.starwars.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starwars.api.models.Rebelde;
import com.starwars.api.repository.RebeldeRepository;





@RestController
@RequestMapping(value="/api")
public class RebeldeController{
	
	@Autowired
	RebeldeRepository rebeldeRepository;
	
	@GetMapping("/rebeldes")
	public List<Rebelde> listaRebeldes(){
		return rebeldeRepository.findAll();
	}
	
	@PostMapping("/inserirRebelde")
	public Rebelde salvaRebelde(@RequestBody Rebelde rebelde) {
		return rebeldeRepository.save(rebelde);	
		
	}
}