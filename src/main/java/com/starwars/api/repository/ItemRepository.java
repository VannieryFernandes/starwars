package com.starwars.api.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.starwars.api.models.Item;


public interface ItemRepository extends JpaRepository<Item, Long> {
	Item findById(long idItem);
	
	
	
}
