package com.demo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demo.model.EmpModel;
import com.demo.demo.payload.EmpDto;
import com.demo.demo.repository.EmpRepo;
import com.demo.demo.services.EmpService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/emp")
public class EmpController {

	private EmpService empService;
	
	//for get api
	
	private EmpRepo empRepo;
	
	public EmpController(EmpService empService, EmpRepo empRepo) {
		super();
		this.empService = empService;
		this.empRepo = empRepo;
	}


	@PostMapping("/createEmpRecord")
	public ResponseEntity<EmpDto> createEmp(@RequestBody EmpDto empDto) {
		EmpDto empDto2 = this.empService.addEmpData(empDto);
		return new ResponseEntity<EmpDto>(empDto2, HttpStatus.OK);
	}
	

	@GetMapping("/getAllData")
	public List<EmpModel> sendToApi() {
		return empRepo.findAll();
	}

}
