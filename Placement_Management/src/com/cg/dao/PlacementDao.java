package com.cg.dao;

import com.cg.entities.Placement;

public interface PlacementDao {
	Placement addPlacement(Placement placement);
	Placement updatePlacement(Placement placement);
	Placement searchPlacement(long id);
	boolean canclePlacement(long id);
	
	void commitTransaction();
	void beginTransaction();

}