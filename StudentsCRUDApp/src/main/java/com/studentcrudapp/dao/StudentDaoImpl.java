package com.studentcrudapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentcrudapp.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session session;

	@Override
	@Transactional
	public void addStudent(Student student) {
		// TODO Auto-generated method stub

		try {
			Session session = sessionFactory.getCurrentSession();
			Transaction tx = session.beginTransaction();
			session.save(student);
			tx.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	@Transactional
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub

		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();

		session.update(student);
		tx.commit();

	}
	@Override
	@Transactional
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub

		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();

		Student theStudent = session.get(Student.class, id);
		tx.commit();

		return theStudent;
	}

	@Override
	@Transactional
	public void removeStudent(int id) {
		// TODO Auto-generated method stub

		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();

		Student theStudent = session.get(Student.class, id);

		session.delete(theStudent);
		tx.commit();

	}

	@Override
	@SuppressWarnings("deprecation")
	@Transactional
	public List<Student> listStudents() {
		// TODO Auto-generated method stub

		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();

		List students = session.createQuery("from Student").list();
		
		System.out.println(students);

		return students;
	}

}
