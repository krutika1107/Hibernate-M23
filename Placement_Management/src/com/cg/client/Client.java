package com.cg.client;

import java.time.LocalDate;

import com.cg.entities.Admin;
import com.cg.entities.Certificate;
import com.cg.entities.College;
import com.cg.entities.Placement;
import com.cg.entities.Student;
import com.cg.entities.User;
import com.cg.services.AdminServices;
import com.cg.services.AdminServicesImpl;
import com.cg.services.PlacementServices;
import com.cg.services.PlacementServicesImpl;
import com.cg.services.StudentServices;
import com.cg.services.StudentServicesImpl;


@SuppressWarnings("unused")
public class Client {

	public static void main(String[] args) {
		 //Lazy initialization
		Student s=new Student();
		StudentServicesImpl Service = new StudentServicesImpl();
		
		s.setId(101);
		s.setName("Krutika");
		s.setRoll(10);
		//s.setCollege("JSCOE");
		s.setQualification("BSC");
		s.setCourse("CS");
		s.setYear(2022);
		s.setHallTicketNo(110711);
		
		//----certificate
		Certificate c = new Certificate();
		c.setId(201);
		c.setYear(2022);
		
		//Adding certificate and student
		s.setCertificate(c);
		c.setStudent(s);
		
		//Adding column
		Service.addCertificate(c);
		
				//Display output for student table
				System.out.println("Student Id is: "+s.getId());
				System.out.println("Student name is: " +s.getName());
				System.out.println("Student Roll no. is: "+s.getRoll());
				System.out.println("Student Qualification Id is: "+s.getQualification());
				System.out.println("Student Course is: "+s.getCourse());
				System.out.println("Student Year is: "+s.getYear());
				System.out.println("Student College is: "+s.getCollege());
				System.out.println("Student Hall ticket is: "+s.getHallTicketNo());
				//Displaying output for certificate table
				System.out.println("Certificate Id is: "+c.getId());
				System.out.println("Certificate Year is: "+c.getYear());
				
				//College input 
				College C=new College();
				C.setId(4040);
				C.setCollegeName("LUC");
				C.setLocation("Borivali");
				
				//Placement input
				Placement p=new Placement();
				PlacementServices placement =new PlacementServicesImpl();
				p.setId(1515);
				p.setName("TNS Foundation");
				p.setQualification("BSC");
				p.setYear(2022);
				p.setCollege(C);
				LocalDate date=LocalDate.now();
				p.setDate(date);
				placement.addPlacement(p);
				
				//set method for college 
				C.setCollegeName("PCCOE");
				//Add Placement
				placement.addPlacement(p);
				
				//for college table
			    System.out.println("College Id is: "+C.getId());
				System.out.println("College Name is: "+C.getCollegeName());
				System.out.println("College Location is : "+C.getLocation());
				
				//for placement table
				System.out.println("Placement Id is: "+p.getId());
				System.out.println("Placement Date is: "+p.getDate());
				System.out.println("Placement Qualification is: "+p.getQualification());
				System.out.println("Placement Year is: "+p.getYear());
				System.out.println("Placement Name is: "+p.getName());
				System.out.println("Placement College is: "+p.getCollege());
				
				//For User
				User u=new User();
				u.setId(1010);
				u.setName("Shraddha");
				u.setPassword("14525");
				u.setType("new User");
				
				//Admin input 
				Admin a=new Admin();
				AdminServices ad=new AdminServicesImpl();
				a.setId(4585);
				a.setName("Devyani");
				a.setPassword("45345");
						
				//Set methods for User and Admin
				u.setAdmin(a);
				a.setUser(u);
						
				//Adding data
				ad.addNewAdmin(a);
				
				//for User table
			    System.out.println("User ID is : " +u.getId());
				System.out.println("User Name is: "+u.getName());
				System.out.println("User Type is : "+u.getType());
				System.out.println("User Password is : "+u.getPassword());
				
				
				//Displaying output for admin table
				System.out.println("Admin ID is : " +a.getId());
				System.out.println("Admin Name is: "+a.getName());
				System.out.println("Admin Password is : "+a.getPassword());
			  
				
			
				System.out.println(" ");
				System.out.println("Data is inserted successfully");
				
				
			    
			    System.out.println(" ");
				System.out.println("Data Updated successfully");
}
}