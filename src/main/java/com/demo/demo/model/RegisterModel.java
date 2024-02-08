package com.demo.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="register_user")
public class RegisterModel {

	@Id //specify id to perticular column of table
	@GeneratedValue(strategy = GenerationType.IDENTITY) //For automatically generate
//	they have four type is .IDENTITY(is for creating single table and value is 1,2,3,4 
//	like that), .AUTO(IS default type), .SEQUENCY(created two table generated value like 
//	(table1- 1,3,5,7)(table2-2,4,6) at time of joining table conflict not occure bcoz value not same), 
	
	private int id;
	
	private String name;
	private String email;
	private String mobileNumber;
	private String status;
	
	
}