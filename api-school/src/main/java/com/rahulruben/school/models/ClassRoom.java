package com.rahulruben.school.models;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ClassRoom {
	private List<Student> students;
	private String classTeacher;
	private String className;
	
	public ClassRoom() {

	}
	
	public ClassRoom(List<Student> students, String classTeacher, String className) {
		this.students = students;
		this.classTeacher = classTeacher;
		this.className = className;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public String getClassTeacher() {
		return classTeacher;
	}

	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
}
