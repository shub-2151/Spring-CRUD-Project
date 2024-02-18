package com.EmpMngSpringBoot.services;

import java.util.List;

import com.EmpMngSpringBoot.model.EmpModel;
import com.EmpMngSpringBoot.payload.EmpDto;

public interface EmpService {

	EmpDto addEmpData(EmpDto empDto);
	
	List<EmpModel> sendTOApi();
	
}
