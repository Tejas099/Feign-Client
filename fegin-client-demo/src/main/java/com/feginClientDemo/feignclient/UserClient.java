package com.feginClientDemo.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.feginClientDemo.entity.UserAddEntity;
import com.feginClientDemo.entity.UserEntity;

@FeignClient(name = "demo", url = "http://localhost:8006", path = "/users", configuration = ClientConfiguration.class)
public interface UserClient {

	@PostMapping("/getAllUsers")
	public ResponseEntity<List<UserEntity>> getAllUser();
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody UserAddEntity user);
	
}
