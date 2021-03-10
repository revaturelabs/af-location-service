package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dto.BuildingDto;
import com.revature.repository.BuildingRepository;

@Service
public class BuildingServiceImpl implements BuildingService{

	private BuildingRepository br;

	@Autowired
	public BuildingServiceImpl(BuildingRepository br) {
		this.br=br;
	}

	@Override
	public List<BuildingDto> getAllBuildingsAtLocation(int id) {
		return br.findAllBuildingsByLocationId(id);
	}

}
