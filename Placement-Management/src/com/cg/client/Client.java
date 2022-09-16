package com.cg.client;

import com.cg.entites.Certificate;
import com.cg.entites.College;
import com.cg.entites.Student;
import com.cg.entites.User;
import com.cg.service.CertificateServiceImp;
import com.cg.service.CollegeServiceImp;
import com.cg.service.ICertificateService;
import com.cg.service.ICollegeService;
import com.cg.service.IStudentService;
import com.cg.service.IUserService;
import com.cg.service.StudentServiceImp;
import com.cg.service.UserServiceImp;

public class Client {

	private static Student studentPurva;

	public static void main(String[] args) 
	{
		IStudentService studentService = new StudentServiceImp();
		ICollegeService collegeService = new CollegeServiceImp();
		IUserService userService = new UserServiceImp();
		ICertificateService certificateService = new CertificateServiceImp();
		
		College collegeJSPM = new College();
		collegeJSPM.setCollegeName("LUC");
		collegeJSPM.setLocation("Mumbai");
		collegeService.addCollege(collegeJSPM);
		
		User user = new User();
		user.setName("Krutika");
		user.setPassword("KP1107");
		user.setType("System User");
		user.setCollege(collegeJSPM);
		userService.addNewUser(user);
		
		
		collegeJSPM.setUser(user);
		collegeService.updateColleget(collegeJSPM);	
		
			
		Student studentAkshay=new Student();
		studentAkshay.setName("Purva");
		studentAkshay.setRollno(101);
		studentAkshay.setQualification("BE");
		studentAkshay.setCollege(collegeJSPM);
		studentAkshay.setCourses("CS");
		studentAkshay.setHallTicketNo(4045);
		studentAkshay.setYear(2022);
		studentService.addStudent(studentPurva);
	
		
		Certificate certificate = new Certificate();
		certificate.setStudent(studentPurva);
		certificate.setYear(2022);
		certificateService.addCertificate(certificate);
		
		studentAkshay.setCertificate(certificate);
		studentService.updateStudent(studentPurva);
		System.out.println("The Data is added");
	}

}
