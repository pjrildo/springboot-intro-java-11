package com.pjrildo.springfs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pjrildo.springfs.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
