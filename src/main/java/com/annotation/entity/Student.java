package com.annotation.entity;

public class Student {
	private String name;
	
	public Student(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public void studing() {
		System.out.println(this.name+" is studing");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
