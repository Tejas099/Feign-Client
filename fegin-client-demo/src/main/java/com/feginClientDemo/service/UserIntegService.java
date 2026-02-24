package com.feginClientDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feginClientDemo.entity.UserAddEntity;
import com.feginClientDemo.entity.UserEntity;
import com.feginClientDemo.feignclient.UserClient;

@Service
public class UserIntegService {
	
	@Autowired
	public UserClient userClient;
	
	
	public List<UserEntity> getAllUserService() {
		
		return userClient.getAllUser().getBody();
	}
	
	
	public String addUserService(UserAddEntity user) {
		return userClient.addUser(user);
	}

}
