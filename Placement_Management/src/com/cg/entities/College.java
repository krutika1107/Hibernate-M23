package com.cg.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("unused")
@Entity
@Table(name="college")
public class College  
{
	
	@Id
	private int id;
	private String CollegeName ;
	private String location ;
	private User collegeAdmin ;
	
	//@OneToMany(cascade=CascadeType.ALL) //Using OneToOne Mapping
		public Student Student;
	//@OneToOne(mappedBy="College") //Using OneToOne Mapping
		private Certificate certificate;
		
	
	
	// getter and setter method
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getCollegeAdmin() {
		return collegeAdmin;
	}
	public void setCollegeAdmin(User collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	//to-String method to convert object into string
	@Override
	public String toString() {
		return "College [CollegeName=" + CollegeName + "]";
	}
	
}