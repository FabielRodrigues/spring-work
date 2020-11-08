package com.fabielrodrigues.work.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabielrodrigues.work.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
