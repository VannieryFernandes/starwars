package com.starwars.api.models;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="localizacao")
@NamedQuery(name="localizacao.findAll", query="SELECT c FROM Localizacao c")
public class Localizacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_localizacao", nullable=false)
	private Long idLocalizacao;

	@OneToOne
	private Rebelde rebelde;


	public Localizacao() {
	}


	public Long getIdLocalizacao() {
		return idLocalizacao;
	}


	public void setIdLocalizacao(Long idLocalizacao) {
		this.idLocalizacao = idLocalizacao;
	}


	public Rebelde getRebelde() {
		return rebelde;
	}


	public void setRebelde(Rebelde rebelde) {
		this.rebelde = rebelde;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
