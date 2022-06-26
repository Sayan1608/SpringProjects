package com.greatlearning.collegefest.Service;

import java.util.List;

import com.greatlearning.collegefest.Entity.Student;

public interface StudentService {

	public List<Student> findAll();

	public Student findById(int theId);

	public void saveStudent(Student theStudent);

	public void deleteById(int theId);

//	public void updateStudent(Student theStudent);
}
