package com.nitchinho.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nitchinho.cursojava.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
