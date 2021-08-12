package com.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.annotation.entity.Student;

//@Controller
@RestController
public class MyController {
	@Autowired
	@Qualifier("Student2")
	private Student student;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	// set url and request type method
	//@ResponseBody - not required with @RestController
	// tells a container that object return is automatically serealize to json and
	// pass back into http response
	public Student home(@RequestBody Student st) {// @RequestBody: if we have json data from form, de-serealize the json
													// object to class object
		System.out.println("this is home method");
		return student;
	}
	@GetMapping("/user/{id}")//set url with RequestMethod.GET
	public String user(@PathVariable String id) {//get value from path variable 'id'
		return id;
	}
}

//<input name='email' />
//public String user(@RequestParam("email") String email)
