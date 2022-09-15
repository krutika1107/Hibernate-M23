package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Student;

public class StudentDaoImpl implements StudentDao 
{
	private EntityManager em;
	
	

	public StudentDaoImpl() {
		super();
		em=JPAUtil.getEntityManager();
	}



	@Override
	public Student addStudent(Student student) {
		em.persist(student);
		return student;
	}



	@Override
	public Student updateStudent(Student student) {
		em.merge(student);
		return student;
	}



	public boolean deleteStudent(int id) {
		em.remove(id);
		return false;
	}



	public Student searchStudentById(int id) {
		Student student=em.find(Student.class,id);
		return student;
	}



	public Student searchStudentByHallTicketNo(int hallTicketNo) {
		Student student=em.find(Student.class,hallTicketNo);
		return student;
	}



	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}



	@Override
	public void commitTransaction() {
		em.getTransaction().commit();

		
	}



	@Override
	public Student searchStudentByID(long id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Student searchStudentByHallticket(long ticketNo) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean deleteStudent(long id) {
		// TODO Auto-generated method stub
		return false;
	}



}