package com.starwars.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starwars.api.models.Localizacao;
import com.starwars.api.models.Rebelde;
import com.starwars.api.models.Reporte;
import com.starwars.api.repository.InventarioRepository;
import com.starwars.api.repository.ItemRepository;
import com.starwars.api.repository.LocalizacaoRepository;
import com.starwars.api.repository.RebeldeRepository;
import com.starwars.api.repository.ReporteRepository;


@RestController
@RequestMapping(value="/api")
public class StarWarsController{
	private RebeldeRepository rebeldeRepository;
	private LocalizacaoRepository localizacaoRepository;
	private InventarioRepository inventarioRepository;
	private ItemRepository itemRepository;
	private ReporteRepository reporteRepository;
	
	/*
	 * Construtor com injeção de dependencia
	 */
	@Autowired
	public StarWarsController(RebeldeRepository rebeldeRepository,
							 LocalizacaoRepository localizacaoRepository,
							 InventarioRepository inventarioRepository,
							 ItemRepository itemRepository,
							 ReporteRepository reporteRepository){
		this.rebeldeRepository=rebeldeRepository;
		this.localizacaoRepository=localizacaoRepository;
		this.inventarioRepository=inventarioRepository;
		this.itemRepository = itemRepository;
		this.reporteRepository =reporteRepository; 
	}
	
	/* 
	 * Método de inserção do Rebelde,da Localização e do Inventário 
	 * 
	 * 
	 */
	
	@PostMapping("/inserirRebelde")
	public Rebelde criarRebelde(@RequestBody Rebelde rebelde) {
		
		localizacaoRepository.save(rebelde.getLocalizacao());
		inventarioRepository.save(rebelde.getInventario());
		itemRepository.saveAll(rebelde.getInventario().getItens());
		return rebeldeRepository.save(rebelde);
		
	}
	
	/*
	 *  Inserção de uma nova coordenada ao rebelde
	 */
	
	@PostMapping("novaLocalizacao/{idRebelde}")
	public Localizacao novaLocalizacao(@RequestBody Localizacao localizacao, @PathVariable("idRebelde") Long idRebelde) {
		
		Rebelde rebelde =rebeldeRepository.findById(idRebelde).get();
		Localizacao localExiste =rebelde.getLocalizacao();
		localExiste.setLatitude(localizacao.getLatitude());
		localExiste.setLongitude(localizacao.getLongitude());
		localExiste.setNomeGalaxia(localizacao.getNomeGalaxia());
				
		return localizacaoRepository.save(localExiste);
	}
	
	/*
	 *  Inserção de reporte de um rebelde para defini-lo como traidor 
	 *  
	 */
	@PostMapping("reportarRebelde/{idRebelde}")
	public Reporte reportar(@RequestBody Reporte reporte,@PathVariable("idRebelde") Long idRebelde){
		Rebelde rebelde = rebeldeRepository.findById(idRebelde).get();
		
		reporte.setIdRebelde(rebelde.getIdRebelde());
		
		
		return reporteRepository.save(reporte);
		
	}
	
	@GetMapping("/rebeldes") public List<Rebelde> listaRebeldes(){ 
		return this.rebeldeRepository.findAll(); 
		}

	
	
	
	
	
}