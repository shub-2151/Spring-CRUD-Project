//package controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import Repository.RegisterRepo;
//
//
////All Restful API are design inside of this package 
//
//@CrossOrigin("*")
//@RestController
//@RequestMapping("/api/register")
//public class RegisterController {
//
//	@Autowired
//	private RegisterRepo registerrepo;
//	
//	@GetMapping("/books")
//	public String getData() {
//		return "Hello";
//	}
//	
//}
package com.demo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demo.model.RegisterModel;
import com.demo.demo.payload.RegisterDto;
import com.demo.demo.repository.registerRepo;
import com.demo.demo.services.RegisterService;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/register")
public class RegisterController {

	@Autowired
	private registerRepo rRepo;
	
	@Autowired
	private RegisterService rService;
	
	@GetMapping("/getUser")
	public List<RegisterModel> getAllUser(){
		return rRepo.findAll();
	}
	
//	@PostMapping("/create")
//	public RegisterModel createUser(@RequestBody RegisterModel rModel) {
//		return rRepo.save(rModel);
//	}
	
	@PostMapping("/create")
	public ResponseEntity<RegisterDto> createUser(@RequestBody RegisterModel rModel) {
		RegisterDto createRDto = this.rService.createUser(rModel);
		return new ResponseEntity<RegisterDto>(createRDto,HttpStatus.CREATED);
	}
}










	
//	@PostMapping("/create")
//	private ResponseEntity<AreaDto> createArea(@RequestBody Area area){
//		AreaDto createdAreaDto=this.areaService.createArea(area);
//		return new ResponseEntity<AreaDto>(createdAreaDto,HttpStatus.CREATED);
//	}
	

