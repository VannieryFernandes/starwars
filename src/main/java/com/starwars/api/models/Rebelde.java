package com.starwars.api.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="rebelde")
@NamedQuery(name="rebelde.findAll", query="SELECT c FROM Rebelde c")
public class Rebelde implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_rebelde", nullable=false)
	private Long idRebelde;

	@Column(length=45)
	private String nome;
	
	@Column(length=45)
	private int idade;
	
	@Column(length=45)
	private String genero;
	
	@Column(length=45)
	private Boolean isRebelde;

	@OneToMany(mappedBy="rebelde")
	private List<Reporte> reportes;

	@OneToOne
	private Localizacao localizacao;
	
	@OneToOne
	private Inventario inventario;

	public Rebelde() {
	}

	
	public Long getIdRebelde() {
		return idRebelde;
	}

	public void setIdRebelde(Long idRebelde) {
		this.idRebelde = idRebelde;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public boolean isRebelde() {
		return isRebelde;
	}

	public void setRebelde(boolean isRebelde) {
		this.isRebelde = isRebelde;
	}

	public List<Reporte> getReportes() {
		return reportes;
	}

	public void setReportes(List<Reporte> reportes) {
		this.reportes = reportes;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}