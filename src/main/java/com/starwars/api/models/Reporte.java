package com.starwars.api.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="reporte")
@NamedQuery(name="reporte.findAll", query="SELECT c FROM Reporte c")
public class Reporte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_reporte", nullable=false)
	private Long idReporte;

	public Long getIdReporte() {
		return idReporte;
	}

	public void setIdReporte(Long idReporte) {
		this.idReporte = idReporte;
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

	@ManyToOne
	private Rebelde rebelde;
	
	public Reporte() {
	}
}
