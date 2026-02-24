package com.feginClientDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

	private long id;
	
	private String email;
	
	private String userName;
	
	private String password;
	
	private String role;

}
