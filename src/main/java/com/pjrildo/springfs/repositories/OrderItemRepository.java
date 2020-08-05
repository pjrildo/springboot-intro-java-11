package com.pjrildo.springfs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pjrildo.springfs.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
