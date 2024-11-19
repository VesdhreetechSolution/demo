package com.pd.clinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pd.clinic.entity.User;
import com.pd.clinic.exception.ServiceResponse;
import com.pd.clinic.service.UserService;

@RestController
@RequestMapping("v1/user")
public class UserCotroller {
	
	@Autowired
	private UserService userService;

	@PostMapping
	public ServiceResponse saveUser(@RequestBody User user) {

		return ServiceResponse.asSuccess(userService.saveUser(user));
	}
	
	@GetMapping("/id")
	public ServiceResponse saveUser(@RequestParam("id") String id) {

		return ServiceResponse.asSuccess(userService.getUser(id));
	}
	
	@DeleteMapping("/{id}")
	public ServiceResponse deleteUser(@PathVariable("id") String id) {

		return ServiceResponse.asSuccess(userService.deleteUser(id));
	}
	
	@GetMapping
	public ServiceResponse getAllUser() {

		return ServiceResponse.asSuccess(userService.getAllUser());
	}
	
	
	
	
}
