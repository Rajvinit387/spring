package com.example.restapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.restapi.dao.orderrepository;
import com.example.restapi.dao.osirepository;
import com.example.restapi.dao.uworderrepository;
import com.example.restapi.entities.obj33;
import com.example.restapi.entities.obj11;
import com.example.restapi.entities.obj22;

public class objservice {

	@Autowired
	private orderrepository orderrepository;
	@Autowired
	private uworderrepository uworderrepository;
	@Autowired
	private osirepository osirepository;
	
	
	
	private List<obj33> uworders= new ArrayList<>();
	private List<obj11> orders= new ArrayList<>();
	private List<obj22> osi= new ArrayList<>();
	
	public obj33 addObj33(obj33 u)
	{
		obj33 uw= uworderrepository.save(u);
		return uw;
		
	}
	
	public obj11 addObj11(obj11 o)
	{
		obj11 oo= orderrepository.save(o);
		return oo;
		
	}
	public obj22 addObj22(obj22 so)
	{
		obj22 sop= osirepository.save(so);
		return sop;
		
	}
}
