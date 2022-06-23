package com.studentcrudapp.dao;

import java.util.List;

import com.studentcrudapp.entity.Student;

public interface StudentDao {
	public void addStudent(Student student);

	public void updateStudent(Student student);

	public Student getStudentById(int id);

	public void removeStudent(int id);

	public List<Student> listStudents();
}
