package com.nitchinho.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nitchinho.cursojava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
