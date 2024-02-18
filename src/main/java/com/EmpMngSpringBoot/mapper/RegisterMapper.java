package com.EmpMngSpringBoot.mapper;

import com.EmpMngSpringBoot.model.RegisterModel;
import com.EmpMngSpringBoot.payload.RegisterDto;

public class RegisterMapper {

// Use of this mapper class is converting Dto to Entity and Entity to Dto. 
// Why we convert - bcoz use of Dto insted of Entity is best practise and security purpose use dto insted of Entity
// if you are retriving data then get only this field which you want that why isential information becoming secure
	
	// make static method for mapping RegisterDto to RegisterModel
	public static RegisterModel mapToRegisterModel (RegisterDto registerDto) {
		RegisterModel registerModel = new RegisterModel(
		registerDto.getId(),
		registerDto.getName(),
		registerDto.getEmail(),
		registerDto.getMobileNumber(),
		registerDto.getStatus()
		);
		return registerModel;
	}
	
	// make static method for converting(mapping) RegisterModel to RegisterDto
	public static RegisterDto mapToDto(RegisterModel registerModel) {
		RegisterDto registerDto = new RegisterDto(
				registerModel.getId(),
				registerModel.getName(),
				registerModel.getEmail(),
				registerModel.getMobileNumber(),
				registerModel.getStatus()
				);
		return registerDto;
	}
}
