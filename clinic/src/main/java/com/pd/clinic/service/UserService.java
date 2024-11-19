package com.pd.clinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pd.clinic.entity.User;
import com.pd.clinic.repository.UserRepository;
import com.pd.clinic.userinfo.ErrorResponse;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}

	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return userRepository.findByUserId(userId);
	}

	public ErrorResponse deleteUser(String userId) {
		// TODO Auto-generated method stub
		
		ErrorResponse errorResponse = new ErrorResponse();
		int i= userRepository.deleteByUserId(userId);
		
		if (i> 0) {
			errorResponse.setError(false);
			errorResponse.setMessage("Deleted successfully..");
		}else {
			errorResponse.setError(true);
			errorResponse.setMessage("Fail to deleted..");
		}
		return errorResponse;
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
