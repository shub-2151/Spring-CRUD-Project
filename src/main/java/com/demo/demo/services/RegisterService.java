package com.demo.demo.services;

import java.util.List;

import com.demo.demo.model.RegisterModel;


//its use for implementing in serviceImpl class

public interface RegisterService {

	//declare method for post api
  //Entity name   method name Entity name   make object of this entity
	RegisterModel createUser(RegisterModel rmodel);
	
	RegisterModel save(RegisterModel registerModel);
	
	//for getting all data by using api 
	List<RegisterModel> getAllData();

	//declare method for get by id api
	RegisterModel getById(int id);
	
	//declare method for update record	
	RegisterModel updateRecord(RegisterModel user, int id);
	
}