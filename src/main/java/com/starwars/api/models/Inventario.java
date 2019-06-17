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
@Table(name="inventario")
@NamedQuery(name="inventario.findAll", query="SELECT c FROM Inventario c")
public class Inventario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_inventario", nullable=false)
	private Long idInventario;

	@OneToMany(mappedBy = "inventario")
	private List<Item> itens;

	@OneToOne
	private Rebelde rebelde;


	public Inventario() {
	}


	public Long getIdInventario() {
		return idInventario;
	}


	public void setIdInventario(Long idInventario) {
		this.idInventario = idInventario;
	}


	public List<Item> getItens() {
		return itens;
	}


	public void setItens(List<Item> itens) {
		this.itens = itens;
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
