package com.studentcrudapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentcrudapp.dao.StudentDao;
import com.studentcrudapp.entity.Student;

@Service
public class StudentSercviceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub

		studentDao.addStudent(student);

	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub

		studentDao.updateStudent(student);

	}

	@Override
	public List<Student> listStudents() {
		// TODO Auto-generated method stub

		return studentDao.listStudents();

	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub

		return studentDao.getStudentById(id);

	}

	@Override
	public void removeStudent(int id) {
		// TODO Auto-generated method stub

		studentDao.removeStudent(id);

	}

}
