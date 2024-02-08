package com.demo.demo.servicesImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.demo.exceptions.ResourceNotFoundException;
import com.demo.demo.mapper.RegisterMapper;
import com.demo.demo.model.RegisterModel;
import com.demo.demo.payload.RegisterDto;
import com.demo.demo.repository.RegisterRepo;
import com.demo.demo.services.RegisterService;

// serviceImpl is used for controller and the all business logic is inside of serviceImpl class 
// and for serviceImple need service interface for implementation 

// make sure @Service annotation is written 
@Service   // for indicating this class is service class
public class RegisterServicesImpl implements RegisterService{

	
//	inject dependency (register repository dependency) their are two type of dependency 
//	1. setter based dependency- whenever you want optional parameter
//	2. constructor base dependency- whenever you want mandatory parameter
	
	private RegisterRepo rRepo;


	public RegisterServicesImpl(com.demo.demo.repository.RegisterRepo rRepo) {
		super();
		this.rRepo = rRepo;
	}

//	Add unimplements method and add return type
	//this for using Dto
	//getting alldata from api 
	 @Override
	    public RegisterDto createUser(RegisterDto registerDto) {
	        // Convert RegisterDto to RegisterModel using RegisterMapper
	        RegisterModel registerModel = RegisterMapper.mapToRegisterModel(registerDto);
	        
	        // Save the RegisterModel using repository
	        RegisterModel savedModel = rRepo.save(registerModel);
	        
	        // Convert the saved RegisterModel back to RegisterDto and return
	        return RegisterMapper.mapToDto(savedModel);
	    }
	 //this for using model
//	@Override
//	public RegisterDto createUser(RegisterDto registerDto) {
//		
//		return rRepo.save(registerDto);
//	}


//	add unimplement method and change return type using Repository object . method 
	 //sending all data to api
	@Override
	public List<RegisterModel> getAllData() {
		return rRepo.findAll();
	}

	// sending to api  by id
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