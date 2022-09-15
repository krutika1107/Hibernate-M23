package com.cg.dao;

import com.cg.entities.Student;

public interface StudentDao 
{

	public Student addStudent(Student std);
	public Student updateStudent(Student std);
	public Student searchStudentByID(long id);
	public Student searchStudentByHallticket(long ticketNo);
	public boolean deleteStudent(long id);
	
	void commitTransaction();
	void beginTransaction();
	
	
	
}