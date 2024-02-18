package com.EmpMngSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmpMngSpringBoot.model.EmpModel;

public interface EmpRepo extends JpaRepository<EmpModel, Long> {

	
}
