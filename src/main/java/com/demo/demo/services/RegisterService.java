package com.demo.demo.services;

import java.util.List;

import com.demo.demo.model.RegisterModel;
import com.demo.demo.payload.RegisterDto;


//its use for implementing in serviceImpl class

public interface RegisterService {

	//declare method for post api(Getting data from api)
  //Entity name   method name Entity name   make object of this entity
	RegisterDto createUser(RegisterDto rmodel);
	
	//for sending all data by using Get Api (Sending data to api)
	List<RegisterModel> getAllData();

	//declare method for get by id api (Getting id and sending data)
	RegisterModel getById(int id);
	
	//declare method for update record	(Getting data from api)
	RegisterModel updateRecord(RegisterModel user, int id);
	
}