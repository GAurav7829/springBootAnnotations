package com.annotation.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.annotation.entity.Student;

@Configuration
//create methods that return bean
// managed by spring container
@ComponentScan(basePackages = {"myPackage"})
//scan myPackage and sub packages under myPackage
public class MyConfig {

	@Bean("Student1")
	//when we have 2 bean with same type, we can provide name to bean
	@Lazy
	public Student getStudent() {
		System.out.println("Creating Student Object");
		return new Student("Student 1");
	}
	@Bean("Student2")
	@Lazy
	//create object only when object is called
	public Student createStudent() {
		System.out.println("Creating Student Object 2");
		return new Student("Student 2");
	}
	
	@Bean
	public Date getDate() {
		System.out.println("Creating new date object");
		return new Date();
	}
}
