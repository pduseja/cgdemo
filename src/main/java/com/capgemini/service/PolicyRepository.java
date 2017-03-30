package com.capgemini.service;

import org.springframework.data.jpa.repository.JpaRepository;


import com.capgemini.entity.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Long> {

}
