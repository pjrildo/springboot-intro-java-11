package com.pjrildo.springfs.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pjrildo.springfs.entities.Order;
import com.pjrildo.springfs.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = service.findAll(); //resource layer calls service layer method
		return ResponseEntity.ok().body(list); //success http response
	}
	
	@GetMapping(value = "/{id}") //url parameter for id
	public ResponseEntity<Order> findById(@PathVariable Long id) { //tells spring to receive url parameter on endpoint rest controller
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
