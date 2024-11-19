package com.pd.clinic.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;@Configuration
@EnableMethodSecurity(prePostEnabled = true)

public class WebSecurityConfig {

    // Define a SecurityFilterChain bean instead of WebSecurityConfigurerAdapter
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .authorizeHttpRequests() // Updated to authorizeHttpRequests
            .requestMatchers("/**").permitAll() // Use requestMatchers instead of antMatchers
            .and()
            .formLogin(); // Add form-based login for demonstration purposes

        return http.build();
    }

    // Configure AuthenticationManager to handle in-memory authentication
    @Bean
    public AuthenticationManager authenticationManager(HttpSecurity http) throws Exception {
        return http.getSharedObject(AuthenticationManagerBuilder.class)
                .inMemoryAuthentication()
                .passwordEncoder(passwordEncoder())
                .withUser("user1").password("secret1").roles("USER")
                .and()
                .withUser("pradip").password("pradip@123").roles("USER", "ADMIN")
                .and()
                .and()
                .build();
    }

    // Define a PasswordEncoder bean (still using NoOp for now)
    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    // Optional: Custom UserDetailsService for more control over users
    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withUsername("user1")
                .password("secret1")
                .roles("USER")
                .build();

        UserDetails admin = User.withUsername("pradip")
                .password("pradip@123")
                .roles("USER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user, admin);
    }
}