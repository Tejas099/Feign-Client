package com.feginClientDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.feginClientDemo.entity.UserAddEntity;
import com.feginClientDemo.entity.UserEntity;
import com.feginClientDemo.service.UserIntegService;

@RestController
public class FeginController {
	
	@Autowired
	public UserIntegService userService;

	@PostMapping("get-all-users")
	public ResponseEntity<List<UserEntity>> getAllUsersFromUserService() {
		
		return ResponseEntity.ok().body(userService.getAllUserService());
	}
	
	
	@PostMapping("add-user")
	public String addUserService(@RequestBody UserAddEntity user) {
		
		return userService.addUserService(user);
	}
	
	
	@PostMapping("demo")
	public ResponseEntity<List<UserEntity>> getAll() {
		
		List<UserEntity> userList = new ArrayList<>();
		
		UserEntity u1 = new UserEntity(1,"tejasghadshi@gmail.com","teja123", "asdfghjkl","LEAD");
		UserEntity u2 = new UserEntity(1,"hussains@gmail.com","Hussain", "lkdjshd","LEAD");
		
		userList.add(u1);
		userList.add(u2);
		return ResponseEntity.ok().body(userList);
		
	}
}
