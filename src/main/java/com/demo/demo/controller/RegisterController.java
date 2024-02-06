package com.demo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demo.model.RegisterModel;
import com.demo.demo.repository.registerRepo;
import com.demo.demo.services.RegisterService;

//All Restful API are design inside of this package and for that we need servicesImple
// Actually controller leyer is use for design api's but for that controller layer is depend on services 
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
	
	// get by id
	// @Pathvariable - bcoz we are sending value, {id} - for passing dynamic value
	@GetMapping("/getById/{id}")
	public ResponseEntity<RegisterModel> getById(@PathVariable("id") int id){
		RegisterModel getbyid = this.rService.getById(id);
		return new ResponseEntity<RegisterModel>(getbyid, HttpStatus.OK);
	}
	
	@GetMapping("/getAllUseRecord")
//  keyword  list of all data with entity name method name.  return type service. created method inside of servicesImple 	
	public List<RegisterModel> getListOfUser(){
		return rService.getAllData();
	}
	
	//method for update record
	@PutMapping("/update/{id}")
	public ResponseEntity<RegisterModel> updateuser(@PathVariable("id") int id,
													@RequestBody RegisterModel registerModel){
		RegisterModel updateRecord = this.rService.updateRecord(registerModel, id);
		return new ResponseEntity<RegisterModel>(updateRecord,HttpStatus.OK);
	}
	
	// If you are using ResponseEntity then we can add complete response like HttpStatus,header
	//@RequestBody - use to convert json to java object
	
	@PostMapping("/create")
	public ResponseEntity<RegisterModel> createUser(@RequestBody RegisterModel rModel) {
		RegisterModel rController = this.rService.createUser(rModel);
		return new ResponseEntity<RegisterModel>(rController,HttpStatus.CREATED);
	}
			
}