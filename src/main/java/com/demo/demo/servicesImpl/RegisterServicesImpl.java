package com.demo.demo.servicesImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.demo.exceptions.ResourceNotFoundException;
import com.demo.demo.model.RegisterModel;
import com.demo.demo.repository.registerRepo;
import com.demo.demo.services.RegisterService;

// serviceImpl is used for controller and the all business logic is inside of serviceImpl class 
// and for serviceImple need service interface for implementation 

@Service   // for indicating this class is service class
public class RegisterServicesImpl implements RegisterService{

	
//	inject dependency (register repository dependency) their are two type of dependency 
//	1. setter based dependency- whenever you want optional parameter
//	2. constructor base dependency- whenever you want mandatory parameter
	
	private registerRepo rRepo;


	public RegisterServicesImpl(com.demo.demo.repository.registerRepo rRepo) {
		super();
		this.rRepo = rRepo;
	}

//	Add unimplements method and add return type
	
	@Override
	public RegisterModel createUser(RegisterModel rmodel) {
		
		return rRepo.save(rmodel);
	}

	@Override
	public RegisterModel save(RegisterModel registerModel) {
		// TODO Auto-generated method stub
		return null;
	}

//	add unimplement method and change return type using Repository object . method 
	@Override
	public List<RegisterModel> getAllData() {
		return rRepo.findAll();
	}

	// for get by id
	@Override
	public RegisterModel getById(int id) {
		// TODO Auto-generated method stub
		return rRepo.findById(id).orElseThrow(() ->
		new ResourceNotFoundException("User not found"));
	}

	// for update record
	@Override
	public RegisterModel updateRecord(RegisterModel user,int id) {
	RegisterModel EData= rRepo.findById(id).orElseThrow(()->
		new ResourceNotFoundException("user not found"));
	
		 EData.setName(user.getName());
		 EData.setEmail(user.getEmail());
		 EData.setMobileNumber(user.getMobileNumber());
		 EData.setStatus(user.getStatus());
		 
		 rRepo.save(EData);
		 return EData;
	}
		
	
}