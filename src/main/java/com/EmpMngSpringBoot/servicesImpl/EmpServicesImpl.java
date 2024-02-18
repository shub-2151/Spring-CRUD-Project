package com.EmpMngSpringBoot.servicesImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.EmpMngSpringBoot.mapper.EmpMapper;
import com.EmpMngSpringBoot.model.EmpModel;
import com.EmpMngSpringBoot.payload.EmpDto;
import com.EmpMngSpringBoot.repository.EmpRepo;
import com.EmpMngSpringBoot.services.EmpService;

@Service
public class EmpServicesImpl implements EmpService {

	private EmpRepo empRepo;
	
	
	// Constructor
	public EmpServicesImpl(EmpRepo empRepo) {
			super();
			this.empRepo = empRepo;
		}

	
//	get form api using Dto
	
	@Override
	public EmpDto addEmpData(EmpDto empDto) {
		
		EmpModel empModel = EmpMapper.mapToModel(empDto);
		
		EmpModel empModel2 = empRepo.save(empModel);
		
		return  EmpMapper.mapToDto(empModel2);
	}


	//send all to api
	@Override
	public List<EmpModel> sendTOApi() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	
	
	//Test
//	@Override
//    public RegisterDto createUser(RegisterDto registerDto) {
//        // Convert RegisterDto to RegisterModel using RegisterMapper
//        RegisterModel registerModel = RegisterMapper.mapToRegisterModel(registerDto);
//        
//        // Save the RegisterModel using repository
//        RegisterModel savedModel = rRepo.save(registerModel);
//        
//        // Convert the saved RegisterModel back to RegisterDto and return
//        return RegisterMapper.mapToDto(savedModel);
//    }
	
}
