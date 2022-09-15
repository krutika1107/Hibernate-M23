package com.cg.services;


import com.cg.dao.CollegeDao;
import com.cg.dao.CollegeDaoImpl;
import com.cg.entities.College;

public class CollegeServiceImpl implements CollegeServices
{
public CollegeDao dao;
	
	public CollegeServiceImpl() {
		super(); 
		dao=new CollegeDaoImpl();
	}
	
	public College addcollege(College college) {
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		return college;
	}

	
	public College updatecollege(College college) {
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
		return college;
	}

	
	public boolean deleteCollege(long id) {
		boolean college=dao.deleteCollege(id);
		return college;
	}

	@Override
	public College searchCollege(long id) {
		College college=dao.searchCollege(id);	
		return college;
		
	}
	
	public College addCollege(College college) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public College updateCollege(College college) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}