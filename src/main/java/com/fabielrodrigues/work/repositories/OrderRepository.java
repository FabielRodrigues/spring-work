package com.fabielrodrigues.work.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabielrodrigues.work.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
