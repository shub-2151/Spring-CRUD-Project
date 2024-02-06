package com.demo.demo.mapper;

import com.demo.demo.model.RegisterModel;
import com.demo.demo.payload.RegisterDto;

public class RegisterMapper {

// Use of this mapper class is converting Dto to Entity and Entity to Dto. 
// Why we convert - bcoz use of Dto insted of Entity is best practise and security purpose use dto insted of Entity
// if you are retriving data then get only this field which you want that why isential information becoming secure
	
	// make static method for mapping RegisterDto to RegisterModel
	public static RegisterModel mapToRegisterModel (RegisterDto registerDto) {
		RegisterModel registerModel = new RegisterModel();
		
		registerModel.getId();
		registerModel.getName();
		registerModel.getEmail();
		registerModel.getMobileNumber();
		registerModel.getStatus();
		return registerModel;
	}
	
	// make static method for converting(mapping) RegisterModel to RegisterDto
	public static RegisterDto mapToRegisterDto(RegisterModel registerModel) {
		RegisterDto registerDto = new RegisterDto(); // jya class mde convert kraych ahe tyacha object create krane.
		
		registerDto.getId();
		registerDto.getName();
		registerDto.getEmail();
		registerDto.getMobileNumber();
		registerDto.getStatus();
		return registerDto;
	}
}
