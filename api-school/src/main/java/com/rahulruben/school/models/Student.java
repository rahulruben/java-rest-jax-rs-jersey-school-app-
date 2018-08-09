package com.rahulruben.school.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	private int rollNo;
	private String firstName;
	private String lastName;
	private String fatherName;
	
	public Student() {

	}
	
	public Student(int rollNo, String firstName, String lastName, String fatherName) {
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fatherName = fatherName;
	}
	

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
}
