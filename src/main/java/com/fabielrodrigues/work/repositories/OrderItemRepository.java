package com.fabielrodrigues.work.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabielrodrigues.work.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
