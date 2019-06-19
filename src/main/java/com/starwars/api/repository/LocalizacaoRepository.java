package com.starwars.api.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.starwars.api.models.Localizacao;


public interface LocalizacaoRepository extends JpaRepository<Localizacao, Long> {
	Localizacao findById(long idLocalizacao);
	
	
	
}
