package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entites.College;

public class CollegeDaoImp implements ICollegeDao {
	
	private EntityManager em;
	
	public CollegeDaoImp() {
		super();
		em = JPAUtil.getEntityManager();
	}

	public College addCollege(College college) {
		em.persist(college);
		return college;
	}

	public College updateCollege(College college) {
		em.merge(college);
		return college;
	}

	public College searchCollege(int id) {
		College college=em.find(College.class,id);
		return college;
	}

	public boolean deleteCollege(int id) {
		em.remove(id);
		return false;
	}

	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

	public void beginTransaction() {
		em.getTransaction().begin();
	}

}
