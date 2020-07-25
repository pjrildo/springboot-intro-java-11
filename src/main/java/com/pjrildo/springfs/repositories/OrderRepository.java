package com.pjrildo.springfs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pjrildo.springfs.entities.Order;

@Repository //optional annotation, since JpaRepository is already registered
public interface OrderRepository extends JpaRepository<Order, Long>{

}
