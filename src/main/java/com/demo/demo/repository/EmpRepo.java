package com.demo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.demo.model.EmpModel;

public interface EmpRepo extends JpaRepository<EmpModel, Long> {

	
}
