package com.annotation;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.annotation.entity.Emp;
import com.annotation.entity.Student;

import myPackage.Dog;

@SpringBootApplication
/**
 * mark our class as spring boot main class consist of 3 annotations |
 * EnableAutoConfiguration annotation, if we add dependency in pom.xml, it
 * auto-configure the spring. Ex: id we add mySQL dependency, automatically adds
 * the configuration for mySQL. | ComponentScan annotation, scans the current
 * packages and sub packages. | Configuration annotation, allows us to use
 * annotations for dependency injection
 * 
 * @author zero
 *
 */
//@EnableAutoConfiguration
//@ComponentScan
/**
 * @Configuration, mark class as a source of bean defination create methods that
 * return bean
 * 
 * @author zero
 *
 */
public class SpringBootAnnotationsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAnnotationsApplication.class, args);
		// starting point of spring boot application
	}

	@Autowired
	//check type of object present in spring container
	//throw error if no bean found
	@Qualifier("Student1")
	//inject bean with qualifier name Student1
	private Student student;
	// spring container already has object of student as we define bean on Student
	// in MyConfig.java
	@Autowired
	private Date date;
	@Autowired
	private Emp emp;
	@Autowired
	private Dog dog;
	//added @ComponentScan(basePackages = {"myPackage"}) in MyConfig.java

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		student.studing();
		emp.getName();
		dog.eating();
	}
}
