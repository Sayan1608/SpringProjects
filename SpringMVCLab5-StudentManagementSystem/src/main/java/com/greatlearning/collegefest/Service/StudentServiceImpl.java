package com.greatlearning.collegefest.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.greatlearning.collegefest.Entity.Student;

@Repository
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private SessionFactory sessionFactory;

	// create session
	private Session session;

	
	public StudentServiceImpl(SessionFactory sessionFactory) {
		try {
			this.sessionFactory = sessionFactory;
			session = this.sessionFactory.getCurrentSession();
		} catch (HibernateException e) {

			session = sessionFactory.openSession();
		}
	}

	@Override
	@Transactional
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();

		List<Student> students = session.createQuery("from Student").list();
		tx.commit();
		return students;
	}

	@Override
	@Transactional
	public Student findById(int theId) {

		// TODO Auto-generated method stub

		Transaction tx = session.beginTransaction();

		return session.get(Student.class, theId);

	}

	@Override
	@Transactional
	public void saveStudent(Student theStudent) {
		// TODO Auto-generated method stub

		Transaction tx = session.beginTransaction();
		session.save(theStudent);
		tx.commit();

	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		// TODO Auto-generated method stub

		Transaction tx = session.beginTransaction();

		Student student = session.get(Student.class, theId);

		session.delete(student);
		tx.commit();

	}

	@Override
	@Transactional
	public void updateStudent(Student theStudent) {
		// TODO Auto-generated method stub

		Transaction tx = session.beginTransaction();

		Student student = session.get(Student.class, theStudent.getStudentId());

		student.setStudentName(theStudent.getStudentName());
		student.setDepartment(theStudent.getDepartment());
		student.setCountry(theStudent.getCountry());

		session.save(student);
		tx.commit();

	}

}
