package com.rest.webservices.restful_web_services;

import com.rest.webservices.restful_web_services.impl.UserDaoServiceImpl;
import com.rest.webservices.restful_web_services.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

@SpringBootApplication
@Configuration
public class RestfulWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}




}
