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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demo.model.RegisterModel;
import com.demo.demo.repository.registerRepo;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/register")
public class RegisterController {

	@Autowired
	private registerRepo rRepo;
	
	@GetMapping("/books")
	public RegisterModel getData() {
		
	RegisterModel rmModel = new RegisterModel();
	rmModel.setName("shubham");
	rmModel.setEmail("Shubham@gmail.com");
	rmModel.setMobileNumber("9874589655");
	rmModel.setStatus("1");
	
	return rRepo.save(rmModel);
	}
}

