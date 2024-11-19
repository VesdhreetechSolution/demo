package com.pd.clinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pd.clinic.entity.Appointment;
import com.pd.clinic.repository.AppointmentRepository;
import com.pd.clinic.userinfo.ErrorResponse;

@Service
public class AppointmentService {
	
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	public Appointment saveAppointment(Appointment appointment) {
		
		return appointmentRepository.save(appointment);
	}

	public Appointment getAppointment(String id) {
		// TODO Auto-generated method stub
		return appointmentRepository.findByAppointmentId(id);
	}

	public ErrorResponse deleteAppointment(String id) {
		// TODO Auto-generated method stub
		
		ErrorResponse errorResponse = new ErrorResponse();
		int i= appointmentRepository.deleteByAppointmentId(id);
		
		if (i> 0) {
			errorResponse.setError(false);
			errorResponse.setMessage("Deleted successfully..");
		}else {
			errorResponse.setError(true);
			errorResponse.setMessage("Fail to deleted..");
		}
		return errorResponse;
	}

	public List<Appointment> getAllAppointment() {
		// TODO Auto-generated method stub
		return appointmentRepository.findAll();
	}



	
}
