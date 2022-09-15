package com.cg.services;

import com.cg.dao.CertificateDao;
import com.cg.dao.CertificateDaoImpl;
import com.cg.dao.StudentDao;
import com.cg.dao.StudentDaoImpl;
import com.cg.entities.Certificate;
import com.cg.entities.Student;

public class StudentServicesImpl implements StudentServices
{
	// 1: connection between Service and Repository
		private StudentDao st;
		private CertificateDao ce;
		
		// constructor
		public StudentServicesImpl()
		{
			st = new StudentDaoImpl();
		   ce = new CertificateDaoImpl();
		   
		}
	
		@Override
		public Student addStudent(Student student) {
			st.beginTransaction();
			st.addStudent(student);
			st.commitTransaction();
			return student;
		}
		@Override
		public Student updateStudent(Student student) {
			st.beginTransaction();
			st.updateStudent(student);
			st.commitTransaction();
			return student;
		}
		@Override
		public Student searchStudentById(long id) {
			Student Student = st.searchStudentByID(id);
			return Student;
		}
		@Override
		public Student searchStudentByHallTicket(long ticketNo) {
			Student Student = st.searchStudentByHallticket(ticketNo);
			return Student;
		}
		@Override
		public boolean addCertificate(Certificate certificate) {
			st.beginTransaction();
			ce.addCertificate(certificate);
			st.commitTransaction();
			return true;
		}
		@Override
		public boolean updateCertificate(Certificate certificate) {
			st.beginTransaction();
		    ce.updateCertificate(certificate);
			st.commitTransaction();
			return true;
		}
		@Override
		public boolean deleteStudent(long id) {
			st.beginTransaction();
			boolean b = st.deleteStudent(id);
			st.commitTransaction();
			return b;
		}

}