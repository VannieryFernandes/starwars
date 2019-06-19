package com.starwars.api.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.starwars.api.models.Reporte;


public interface ReporteRepository extends JpaRepository<Reporte, Long> {
	Reporte findById(long idReporte);
	
	 @Query("select u from Reporte u where u.id_rebelde = ?1")
	  List<Reporte> listaReporteRebelde(long idRebelde);

}
