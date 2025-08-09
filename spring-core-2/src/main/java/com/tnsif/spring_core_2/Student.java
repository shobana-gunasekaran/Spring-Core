package com.tnsif.spring_core_2;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private String name = "Sham";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void showStudent() {
		System.out.println("Student Name:" + name);
	}
}
