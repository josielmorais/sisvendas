package com.sisvendas.demo.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sisvendas.demo.services.EmailService;
import com.sisvendas.demo.services.MockEmailService;

//import com.sisvendas.demo.services.DBService;

@Configuration
@Profile("test")
public class TestConfig {

//	@Autowired
//	private DBService dbService;
//	
//	@Bean
//	public boolean instantiateDatabase() throws ParseException {
//		dbService.instantiateTestDatabase();
//		return true;
//	}
	
	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}
}
