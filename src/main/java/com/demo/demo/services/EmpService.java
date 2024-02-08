package com.demo.demo.services;

import java.util.List;

import com.demo.demo.model.EmpModel;
import com.demo.demo.payload.EmpDto;

public interface EmpService {

	EmpDto addEmpData(EmpDto empDto);
	
	List<EmpModel> sendTOApi();
	
}
