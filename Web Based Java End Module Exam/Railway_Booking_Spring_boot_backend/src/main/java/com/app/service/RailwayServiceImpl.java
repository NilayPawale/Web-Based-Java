package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.DTO.RailwayDTO;
import com.app.entities.CATEGORY;
import com.app.entities.Railway;
import com.app.repository.RailwayRepository;

@Service
@Transactional
public class RailwayServiceImpl implements RailwayService {

	@Autowired
	private RailwayRepository railRepo;
	
	@Override
	public List<Railway> getAllRailway()
	{
		return railRepo.findAll();
	}
	
	@Override
	public Railway addNewRailway(Railway newRailway)
	{
		return railRepo.save(newRailway);
	}
	
	@Override
	public String deleteRailwayDetails(Long railId)
	{
		return null;
	}
	
	@Override
	public List<Railway> getRailByCat(CATEGORY category)
	{
		return railRepo.findByCategory(category);
	}
	
	@Override
	public void updateRailway(RailwayDTO dto)
	{
		
	}
	
}
