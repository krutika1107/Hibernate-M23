package com.cg.services;

import com.cg.dao.PlacementDao;
import com.cg.dao.PlacementDaoImpl;
import com.cg.entities.Placement;


public class PlacementServicesImpl implements PlacementServices
{
	private PlacementDao dao;
	
	public PlacementServicesImpl() {
		super();
		dao=new PlacementDaoImpl();
	}

	@Override
	public Placement addPlacement(Placement placement) {
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement searchPlacement(long id) {
		Placement placement=dao.searchPlacement(id);
		return placement;
	}

	@Override
	public boolean cancelPlacement(long id) {
		dao.beginTransaction();
		@SuppressWarnings("unused")
		boolean res=dao.canclePlacement(id);
		dao.commitTransaction();
		return res;
	}
	
}