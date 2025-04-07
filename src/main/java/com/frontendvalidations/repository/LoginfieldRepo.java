package com.frontendvalidations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frontendvalidations.entity.Login;

@Repository
public interface LoginfieldRepo extends JpaRepository<Login, Long> {
	

}
