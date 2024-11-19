package com.pd.clinic.security;
import java.io.IOException;
import java.util.UUID;

import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.encrypt.TextEncryptor;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AuthorizationFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void destroy() {

	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		String encryptText = httpRequest.getHeader("tenant");
		
//		System.err.println("encryptText :"+encryptText);

		String Key = "pradip";
		String salt = "3a219b63082c97ba1a04263f8e1f3b00";
		TextEncryptor decryptor = Encryptors.text(Key, salt);
		System.err.println("encryptText "  + encryptText);
		String tenant = decryptor.decrypt(encryptText);
//		System.out.println("tenant : " + tenant);

		TenantContext.setTenantData(UUID.fromString(tenant), tenant, tenant);
		chain.doFilter(request, response);
		TenantContext.reset();
	}

}
