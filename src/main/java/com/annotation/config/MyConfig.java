package com.annotation.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.annotation.entity.Student;

@Configuration
//create methods that return bean
// managed by spring container
public class MyConfig {

	@Bean
	//
	public Student getStudent() {
		System.out.println("Creating Student Object");
		return new Student();
	}
	
	@Bean
	public Date getDate() {
		System.out.println("Creating new date object");
		return new Date();
	}
}
