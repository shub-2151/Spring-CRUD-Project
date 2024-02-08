package com.demo.demo.mapper;

import com.demo.demo.model.EmpModel;
import com.demo.demo.payload.EmpDto;

public class EmpMapper {

	//mapToModel
	public static EmpModel mapToModel(EmpDto empDto) {
	   EmpModel empModel = new EmpModel(
				empDto.getId(),
				empDto.getFName(),
				empDto.getLName(),
				empDto.getEmail(),
				empDto.getMNumber()
				);
		return empModel;
	}
	
	
	//mapToDto	
	public static EmpDto mapToDto(EmpModel empModel) {
		
		 EmpDto empDto = new EmpDto(
				empModel.getId(),
				empModel.getFName(),
				empModel.getLName(),
				empModel.getEmail(),
				empModel.getMNumber()
				);
		return empDto;
	}
	
	
}
