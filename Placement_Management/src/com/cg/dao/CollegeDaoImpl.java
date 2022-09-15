package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.College;


public class CollegeDaoImpl  implements CollegeDao
{

	private EntityManager em;
	
	
	
	public CollegeDaoImpl() {
		em=JPAUtil.getEntityManager();
		
	}

	@Override
	public College addCollege(College college) {
		em.persist(college);
		return college;
	}

	@Override
	public College updateCollege(College college) {
		em.merge(college);
		return college;
	}

	public College searchCollege(int id) {
		College college =em.find(College.class, id);
		return college;
	}

	public boolean deleteCollege(int id) {
		em.remove(id);
		return false;
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
	public College searchCollege(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCollege(long id) {
		// TODO Auto-generated method stub
		return false;
	}


}