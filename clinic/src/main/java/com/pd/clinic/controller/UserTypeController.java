package com.pd.clinic.controller;

import org.hibernate.usertype.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pd.clinic.exception.ServiceResponse;
import com.pd.clinic.service.UserTypeService;

@RestController
@RequestMapping("/v1/user-type")
public class UserTypeController {
	
	@Autowired
	private UserTypeService userTypeService;

	@PostMapping
	public ServiceResponse saveUser(@RequestBody UserType userType) {

		return ServiceResponse.asSuccess(userTypeService.saveUserType(userType));
	}
	
	@GetMapping("/id")
	public ServiceResponse saveUser(@RequestParam("id") String id) {

		return ServiceResponse.asSuccess(userTypeService.getUserType(id));
	}
	
	@DeleteMapping("/{id}")
	public ServiceResponse deleteUser(@PathVariable("id") String id) {

		return ServiceResponse.asSuccess(userTypeService.deleteUserType(id));
	}
	
	@GetMapping
	public ServiceResponse getAllUser() {

		return ServiceResponse.asSuccess(userTypeService.getAllUserType());
	}
}