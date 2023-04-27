package com.nitchinho.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nitchinho.cursojava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
