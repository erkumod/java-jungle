package com.kumud.dto;

public class Student {
	private String name;
	private String city;
	private int rollNo;
	
	public Student(String name ,String city, int rollNo) {
		this.name=name;
		this.city=city;
		this.rollNo=rollNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

}
