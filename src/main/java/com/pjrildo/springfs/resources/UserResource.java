package com.pjrildo.springfs.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pjrildo.springfs.entities.User;
import com.pjrildo.springfs.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll(); //resource layer calls service layer method
		return ResponseEntity.ok().body(list); //success http response
	}
	
	@GetMapping(value = "/{id}") //url parameter for id
	public ResponseEntity<User> findById(@PathVariable Long id) { //tells spring to receive url parameter on endpoint rest controller
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
