package com.nitchinho.cursojava.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nitchinho.cursojava.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User((long) 1, "Maria", "maria@gmail.com", "11964290237", "12345");
		return ResponseEntity.ok().body(u);
	}
}
