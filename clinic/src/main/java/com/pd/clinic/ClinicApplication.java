package com.pd.clinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import com.pd.clinic.security.AuthorizationFilter;

import jakarta.servlet.Filter;

@SpringBootApplication

public class ClinicApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClinicApplication.class, args);
    }
    
	@Bean(name = "authorizationFilter")
	public Filter authorizationFilter() {

		return new AuthorizationFilter();

	}
	 
}
