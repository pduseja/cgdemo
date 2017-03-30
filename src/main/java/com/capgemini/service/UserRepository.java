package com.capgemini.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
