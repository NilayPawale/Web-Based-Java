package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.DTO.RailwayDTO;
import com.app.entities.CATEGORY;
import com.app.entities.Railway;
import com.app.service.RailwayService;

@RestController
@RequestMapping("/railways")
public class RailwayController {

	@Autowired
	private RailwayService railwayServ;
	
	public RailwayController()
	{
		System.out.println("in ctor of"+getClass());
	}
	
	@GetMapping
	public List<Railway> listAllRail()
	{
		return railwayServ.getAllRailway();
	}
	
	@PostMapping
	public Railway addRailway(@RequestBody Railway rail)
	{
		return railwayServ.addNewRailway(rail);
	}
	
	@GetMapping("/category/{category}")
	public List<Railway> GetByCategory(@PathVariable CATEGORY category)
	{
		return railwayServ.getRailByCat(category);
	}
	
	@PutMapping("/update")
	public void updateRailway(RailwayDTO dto)
	{
		railwayServ.updateRailway(dto);
	}
	
}
