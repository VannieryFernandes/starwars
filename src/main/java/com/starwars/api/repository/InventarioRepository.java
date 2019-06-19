package com.starwars.api.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.starwars.api.models.Inventario;


public interface InventarioRepository extends JpaRepository<Inventario, Long> {
	Inventario findById(long idInventario);

}
