package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Placement;


public class PlacementDaoImpl implements PlacementDao
{
	private EntityManager em;
	
	

	public PlacementDaoImpl() {
		em=JPAUtil.getEntityManager();
		
	}

	@Override
	public Placement addPlacement(Placement placement) {
		em.persist(placement);
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		em.merge(placement);
		return placement;
	}

	@Override
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
	


}