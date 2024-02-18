package com.EmpMngSpringBoot.mapper;

import com.EmpMngSpringBoot.model.EmpModel;
import com.EmpMngSpringBoot.payload.EmpDto;

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
