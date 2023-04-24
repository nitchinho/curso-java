package com.nitchinho.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nitchinho.cursojava.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
