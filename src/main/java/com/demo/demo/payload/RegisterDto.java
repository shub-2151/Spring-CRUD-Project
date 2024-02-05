package com.demo.demo.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDto {

	private int id;
	
	private String name;
	private String email;
	private String mobileNumber;
	private String status;
}
