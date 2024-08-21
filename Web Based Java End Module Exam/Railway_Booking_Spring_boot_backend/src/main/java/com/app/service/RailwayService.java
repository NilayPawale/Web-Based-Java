package com.app.service;

import java.util.List;

import com.app.DTO.RailwayDTO;
import com.app.entities.CATEGORY;
import com.app.entities.Railway;

public interface RailwayService {

	List<Railway> getAllRailway();
	
	Railway addNewRailway(Railway newRail);
	
	String deleteRailwayDetails(Long railId);
	
	List<Railway> getRailByCat(CATEGORY category);
	
	void updateRailway(RailwayDTO railwayDTO);
}
