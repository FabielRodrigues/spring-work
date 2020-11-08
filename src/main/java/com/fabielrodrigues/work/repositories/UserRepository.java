package com.fabielrodrigues.work.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabielrodrigues.work.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
