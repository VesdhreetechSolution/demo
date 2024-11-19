package com.pd.clinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pd.clinic.entity.User;
import com.pd.clinic.entity.UserType;
import com.pd.clinic.repository.UserTypeRepository;
import com.pd.clinic.userinfo.ErrorResponse;

@Service
public class UserTypeService {
	
	@Autowired
	private UserTypeRepository userTypeRepository;

	public UserType saveUserType(UserType userType) {
		// TODO Auto-generated method stub
		return userTypeRepository.save(userType);
	}

	public UserType getUserType(String id) {
		// TODO Auto-generated method stub
		return userTypeRepository.findByUserTypeId(id);
	}

	public ErrorResponse deleteUserType(String userId) {
		// TODO Auto-generated method stub
		
		ErrorResponse errorResponse = new ErrorResponse();
		int i= userTypeRepository.deleteByUserTypeId(userId);
		
		if (i> 0) {
			errorResponse.setError(false);
			errorResponse.setMessage("Deleted successfully..");
		}else {
			errorResponse.setError(true);
			errorResponse.setMessage("Fail to deleted..");
		}
		return errorResponse;
	}

	public List<UserType> getAllUserType() {
		// TODO Auto-generated method stub
		return userTypeRepository.findAll();
	}

}
