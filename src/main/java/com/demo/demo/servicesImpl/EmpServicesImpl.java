package com.demo.demo.servicesImpl;

import java.util.List;

import com.demo.demo.payload.EmpDto;
import com.demo.demo.repository.EmpRepo;
import com.demo.demo.services.EmpService;

public class EmpServicesImpl implements EmpService {

	private EmpRepo empRepo;
	
	@Override
	public List<EmpDto> addEmpData(EmpDto empDto) {
		
		return empRepo.save(empDto);
	}

	
}
