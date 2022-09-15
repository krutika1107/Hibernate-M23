package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Placement;
import com.cg.entities.User;


public class UserDaoImpl implements UserDao
{
	private EntityManager em;
	
	

	public UserDaoImpl() {
		em=JPAUtil.getEntityManager();
		
	}

	public Placement addPlacement(Placement placement) {
		em.persist(placement);
		return placement;
	}

	public Placement updatePlacement(Placement placement) {
		em.merge(placement);
		return placement;
	}

	public Placement searchPlacement(long id) {
		Placement placement=em.find(Placement.class, id);
		return placement;
	}

	

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
	}

	public boolean canclePlacement(long id) {
		em.remove(id);
		return false;
	}

	@Override
	public User addNewUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updatedUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	


}