package com.demo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.demo.model.RegisterModel;

import java.util.List;

 
//We are creating repository class and extend JpaRepository - becoz it help to performing CRUD operation
// for sending retriving updating deleting operation done by using repo
//extends JpaRepository- is generic type so we need to write this model name and their id type 

//No need to write this "@Repository" Anotation bcoz its by default provided by JpaRepositotry
public interface RegisterRepo extends JpaRepository<RegisterModel, Integer> {

//	List<RegisterModel> findByMobileNumber(long mobileNumber);
//	List<RegisterModel>findByMobileNumber (long mobileNumber);
//	
//	@Query("select r from RegisterModel r where r.status = :status")
//	List<RegisterModel>findByStatus(String status);
	
//	    @Query("SELECT r FROM RegisterModel r WHERE r.status = :status AND r.name = :name")
//	    List<RegisterModel> findByStatusAndName(String status, String name);

}



