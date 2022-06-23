package com.studentcrudapp.service;

import java.util.List;

import com.studentcrudapp.entity.Student;

public interface StudentService {
	public void addStudent(Student student);

	public void updateStudent(Student student);

	public List<Student> listStudents();

	public Student getStudentById(int id);

	public void removeStudent(int id);
}
