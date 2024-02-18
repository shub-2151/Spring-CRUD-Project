package com.EmpMngSpringBoot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan(basePackages = {"com.EmpMngSpringBoot.model"})
@SpringBootApplication

//implement CommandLineRunner and @Override Run method-it execute when main method start first time
public class EmpMngSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmpMngSpringBootApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	

}