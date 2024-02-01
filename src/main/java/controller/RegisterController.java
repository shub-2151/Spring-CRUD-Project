package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Repository.RegisterRepo;


//All Restful API are design inside of this package 

@CrossOrigin("*")
@RestController
@RequestMapping("/api/register")
public class RegisterController {

	@Autowired
	private RegisterRepo registerrepo;
	
	@GetMapping("/books")
	public String getData() {
		return "Hello";
	}
	
}
