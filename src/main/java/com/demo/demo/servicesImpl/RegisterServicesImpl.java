package com.demo.demo.servicesImpl;

import org.springframework.stereotype.Service;

import com.demo.demo.model.RegisterModel;
import com.demo.demo.payload.RegisterDto;
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
	
}
