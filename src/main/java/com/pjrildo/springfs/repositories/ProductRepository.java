package com.pjrildo.springfs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pjrildo.springfs.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
