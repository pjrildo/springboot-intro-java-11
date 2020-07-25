package com.pjrildo.springfs.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjrildo.springfs.entities.Order;
import com.pjrildo.springfs.repositories.OrderRepository;

@Service //register this class as a spring service to be injected with autowired
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll(); //service layer calls repository layer method
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get(); //optional "get" method returns an parameterized type object 
	}
}
