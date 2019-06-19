package com.starwars.api.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.starwars.api.models.Rebelde;


public interface RebeldeRepository extends JpaRepository<Rebelde, Long> {
	Rebelde findById(long idRebelde);
	
	
	
}
