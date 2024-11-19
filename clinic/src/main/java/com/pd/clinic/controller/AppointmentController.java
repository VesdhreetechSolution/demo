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

import com.pd.clinic.entity.Appointment;
import com.pd.clinic.exception.ServiceResponse;
import com.pd.clinic.service.AppointmentService;

@RestController
@RequestMapping("v1/appointment")
public class AppointmentController {


	
	@Autowired
	private AppointmentService appointmentService;

	@PostMapping
	public ServiceResponse saveAppointment(@RequestBody Appointment appointment) {

		return ServiceResponse.asSuccess(appointmentService.saveAppointment(appointment));
	}
	
	@GetMapping("/{id}")
	public ServiceResponse getAppointment(@PathVariable("id") String id) {

		return ServiceResponse.asSuccess(appointmentService.getAppointment(id));
	}
	
	@DeleteMapping("/{id}")
	public ServiceResponse deleteAppointment(@PathVariable("id") String id) {

		return ServiceResponse.asSuccess(appointmentService.deleteAppointment(id));
	}
	
	@GetMapping
	public ServiceResponse getAllAppointment() {

		return ServiceResponse.asSuccess(appointmentService.getAllAppointment());
	}
	
	
	
	

}
