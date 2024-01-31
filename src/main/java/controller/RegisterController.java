package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Repository.RegisterRepo;
import model.RegisterModel;

import java.util.List;

//All Restful API are design inside of this package 

@RestController
@RequestMapping("/api/register")
public class RegisterController {

	@Autowired
	private RegisterRepo registerrepo;
	
	@GetMapping
	public List<RegisterModel> AllRegisterUser(){
		return registerrepo.findAll();
	}
}
