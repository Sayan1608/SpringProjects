package com.studentcrudapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@Column(name = "studentId")
	private int studentId;

	@Column(name = "studentName")
	private String studentName;

	@Column(name = "department")
	private String department;

	@Column(name = "country")
	private String country;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, String department, String country) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.department = department;
		this.country = country;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
