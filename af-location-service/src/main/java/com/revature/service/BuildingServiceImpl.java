package com.revature.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dto.BuildingDetailsDto;
import com.revature.dto.BuildingDto;
import com.revature.dto.BuildingRequestDto;
import com.revature.dto.RoomDto;
import com.revature.model.Building;
import com.revature.model.Room;
import com.revature.repository.BuildingRepository;

@Service
public class BuildingServiceImpl implements BuildingService{

	

	
	private BuildingRepository buildingRepository;
	private LocationService locationService;
	
	@Autowired
	public BuildingServiceImpl(BuildingRepository repository, LocationService locationService) {
		this.buildingRepository= repository;
		this.locationService = locationService;
	}
	

	@Override
	public List<BuildingDto> getBuildings(){
		List<Building> buildings = buildingRepository.findAll();
		List<BuildingDto> dtos= buildings.stream().map( BuildingServiceImpl::getBuildingDtoFromEntity)
				.collect(Collectors.toList());
		return dtos;
	}
	@Override
	public List<BuildingDto> getBuildingsByCity(String city) {
		List<Building> buildings = buildingRepository.findByCity(city);
		List<BuildingDto> dtos = buildings.stream().map( BuildingServiceImpl::getBuildingDtoFromEntity)
				.collect(Collectors.toList());
		return dtos;
	}
	@Override
	public List<BuildingDto> getBuildingsByStreetAddress(String address){
		List<Building> buildings = buildingRepository.findByStreetAddress(address);
		List<BuildingDto> dtos = buildings.stream().map( BuildingServiceImpl::getBuildingDtoFromEntity)
				.collect(Collectors.toList());
		return dtos;
	}
	@Override
	public BuildingDetailsDto getBuilding(int index) throws Exception{
		Optional<Building> building = buildingRepository.findById(index);
		if(!building.isPresent()) {
			throw new Exception("Building not found");
		}
		return getBuildingDetailsDtoFromEntity(building.get());
	}
	@Override
	public void updateCity(int index, String city) throws Exception{
		cityValidation(city);
		Optional<Building> building = buildingRepository.findById(index);
		if(!building.isPresent()) {
			throw new Exception("Building not found");
		}
		Building entity = building.get();
		entity.setCity(city);
		buildingRepository.save(entity);
		
	}
	@Override
	public void updateZipCode(int index, String zipCode) throws Exception{
		zipCodeValidation(zipCode);
		Optional<Building> building = buildingRepository.findById(index);
		if(!building.isPresent()) {
			throw new Exception("Building not found");
		}
		Building entity = building.get();
		locationService.updateZipCode(entity.getLocation().getLocationId(), zipCode);
		
		
	}
	
	@Override
	public void updateNumberOfFloors(int index, int floorCount) throws Exception{
		numberOfFloorsValidation(floorCount);
		Optional<Building> building = buildingRepository.findById(index);
		if(!building.isPresent()) {
			throw new Exception("building not found");
		}
		Building entity = building.get();
		entity.setTotalFloors(floorCount);
		buildingRepository.save(entity);
	}
	
	@Override
	public void addRoom(int index, Room room) throws Exception{
		Optional<Building> building= buildingRepository.findById(index);
		if(!building.isPresent()) {
			throw new Exception("building not found");
		}
		Building entity = building.get();
		entity.getRooms().add(room);
		room.setBuilding(entity);
		buildingRepository.save(entity);
	}
	@Override 
	public void deleteRoom(int indexBuilding, int indexRoom) throws Exception{
		Optional<Building> building = buildingRepository.findById(indexBuilding);
		if(!building.isPresent()) {
			throw new Exception("Building not found");
		}
		boolean flag = false;
		Building entity = building.get();
		List<Room> rooms = entity.getRooms();
		Optional<Room> roomOptional = rooms.stream().filter( zeRoom -> zeRoom.getRoomId() == indexRoom).findFirst();
		if(roomOptional.isPresent()) {
			rooms.remove(roomOptional.get());
			buildingRepository.save(entity);
		}else {
			throw new Exception("room not found");
		}
	}
	@Override
	public void updateBuilding(int index, BuildingRequestDto requestDto) throws Exception{
		Optional<Building> building = buildingRepository.findById(index);
		if(!building.isPresent()) {
			throw new Exception("building not found");
		}
		Building entity = building.get();
		entity.setCity( requestDto.getCity() );
		entity.setStreetAddress( requestDto.getStreet_address() );
		entity.setTotalFloors( requestDto.getTotalFloors() );
		//TODO update zip code borked, doesn't propagate properly without location repository
		buildingRepository.save( entity );
	}

	//utility functions
	
	private static BuildingDto getBuildingDtoFromEntity(Building building) {
		BuildingDto dto = new BuildingDto();
		dto.setId(building.getBuildingId());
		dto.setNumRooms(building.getRooms().size());
		dto.setTotalFloors(building.getTotalFloors());
		dto.setStreet_address( building.getStreetAddress() );
		return dto;
	}
	private static BuildingDetailsDto getBuildingDetailsDtoFromEntity(Building building) {
		BuildingDetailsDto dto = new BuildingDetailsDto();
		dto.setCity( building.getCity() );
		dto.setId( building.getBuildingId() );
		dto.setStreet_address( building.getStreetAddress() );
		dto.setTotalFloors( building.getTotalFloors() );
		dto.setZipCode( building.getLocation().getZipCode());
		dto.setRooms( getRoomsDtoListFromEntityList(building.getRooms()));
		return dto;
	}
	private static BuildingRequestDto getBuildingRequestDtoFromEntity(Building building) {
		BuildingRequestDto dto = new BuildingRequestDto();
		dto.setCity( building.getCity() );
		dto.setStreet_address( building.getStreetAddress() );
		dto.setTotalFloors( building.getTotalFloors() );
		dto.setZipCode( building.getLocation().getZipCode() );
		return dto;
		
	}
	private static List<RoomDto> getRoomsDtoListFromEntityList(List<Room> rooms){
		return rooms.stream().map( room -> {
			RoomDto dto = new RoomDto();
			dto.setId( room.getRoomId() );
			dto.setOccupation( room.getOccupation().toString());
			dto.setType( room.getType().toString());
			return dto;
			}).collect(Collectors.toList());
	}
	private static void buildingValidation(Building building) throws Exception{
		if(building.getBuildingId() !=0) {
			throw new Exception("id prefilled");
		}
	}
	private static void zipCodeValidation(String zipCode) throws Exception{
		if(false) {
			throw new Exception("invalid zip code");
		}
	}
	private static void cityValidation(String city) throws Exception{
		if(false) {
			throw new Exception("city validation failed");
		}
	}
	private static void numberOfFloorsValidation(int count) throws Exception{
		if( false) {
			throw new Exception("floor count validation failed");
		}
	}
	
}
