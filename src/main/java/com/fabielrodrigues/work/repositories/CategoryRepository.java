package com.fabielrodrigues.work.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabielrodrigues.work.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
