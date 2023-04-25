package com.nitchinho.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nitchinho.cursojava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
