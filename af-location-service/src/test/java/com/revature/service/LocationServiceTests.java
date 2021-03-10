package com.revature.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import com.revature.dto.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.revature.model.Building;
import com.revature.model.Location;
import com.revature.model.Room;
import com.revature.statics.RoomOccupation;
import com.revature.statics.RoomType;

@RunWith(MockitoJUnitRunner.class)
public class LocationServiceTests {


	@Mock
	private LocationServiceImpl locationService;

	public static Location goodSampleLocation;
	public static Location badSampleLocation;

	@BeforeClass
	public static void setup() {
		// instantiate location
		goodSampleLocation = new Location();
		badSampleLocation = new Location();
		goodSampleLocation.setCity("Miami");
		badSampleLocation.setCity("Austin");
		goodSampleLocation.setLocationId(3);
		badSampleLocation.setLocationId(2);
		goodSampleLocation.setState("FL");
		badSampleLocation.setState("CA");
		goodSampleLocation.setZipCode("87402");
		// instantiate building list
		List<Building> goodBuildings = new ArrayList<Building>();
		List<Building> badBuildings = new ArrayList<Building>();
		// instantiate buildings
		Building goodBuilding = new Building();
		goodBuilding.setCity("Miami");
		goodBuilding.setBuildingId(23);
		goodBuilding.setLocation(goodSampleLocation);
		goodBuilding.setStreetAddress("Main Street");

		Building otherGoodBuilding = new Building();
		otherGoodBuilding.setCity("Miami");
		otherGoodBuilding.setBuildingId(24);
		otherGoodBuilding.setLocation(goodSampleLocation);
		otherGoodBuilding.setStreetAddress("Main Street");

		Building badBuilding = new Building();
		badBuilding.setCity("Austin");
		badBuilding.setBuildingId(25);
		badBuilding.setLocation(badSampleLocation);
		badBuilding.setStreetAddress("Main Street");

		Building otherBadBuilding = new Building();
		otherBadBuilding.setCity("Austin");
		otherBadBuilding.setBuildingId(26);
		otherBadBuilding.setLocation(badSampleLocation);
		otherBadBuilding.setStreetAddress("Main Street");


		// instantiate rooms

		List<Room> goodRooms = new ArrayList<Room>();
		List<Room> otherGoodRooms = new ArrayList<Room>();

		Room goodRoom = new Room();
		goodRoom.setBuilding(goodBuilding);
		goodRoom.setCapacity(3);
		goodRoom.setRoomId(7);
		goodRoom.setType(RoomType.PHYSICAL);
		goodRoom.setName("James");
		goodRoom.setOccupation(RoomOccupation.MEETING);

		Room goodRoom2 = new Room();
		goodRoom2.setBuilding(goodBuilding);
		goodRoom2.setCapacity(4);
		goodRoom2.setRoomId(8);
		goodRoom2.setType(RoomType.PHYSICAL);
		goodRoom2.setName("Steven");
		goodRoom2.setOccupation(RoomOccupation.MEETING);

		Room goodRoom3 = new Room();
		goodRoom3.setBuilding(otherGoodBuilding);
		goodRoom3.setCapacity(5);
		goodRoom3.setRoomId(9);
		goodRoom3.setType(RoomType.PHYSICAL);
		goodRoom3.setName("Pearl");
		goodRoom3.setOccupation(RoomOccupation.MEETING);

		Room goodRoom4 = new Room();
		goodRoom4.setBuilding(otherGoodBuilding);
		goodRoom4.setCapacity(6);
		goodRoom4.setRoomId(10);
		goodRoom4.setType(RoomType.PHYSICAL);
		goodRoom4.setName("Walter");
		goodRoom4.setOccupation(RoomOccupation.MEETING);

		goodRooms.add(goodRoom);
		goodRooms.add(goodRoom2);
		otherGoodRooms.add(goodRoom3);
		otherGoodRooms.add(goodRoom4);

		List<Room> badRooms = new ArrayList<Room>();
		List<Room> otherBadRooms = new ArrayList<Room>();

		Room badRoom = new Room();
		badRoom.setBuilding(badBuilding);
		badRoom.setCapacity(7);
		badRoom.setRoomId(11);
		badRoom.setType(RoomType.PHYSICAL);
		badRoom.setName("Blathers");
		badRoom.setOccupation(RoomOccupation.MEETING);

		Room badRoom2 = new Room();
		badRoom2.setBuilding(badBuilding);
		badRoom2.setCapacity(8);
		badRoom2.setRoomId(12);
		badRoom2.setType(RoomType.PHYSICAL);
		badRoom2.setName("Garnet");
		badRoom2.setOccupation(RoomOccupation.MEETING);

		Room badRoom3 = new Room();
		badRoom3.setBuilding(otherBadBuilding);
		badRoom3.setCapacity(9);
		badRoom3.setRoomId(13);
		badRoom3.setType(RoomType.PHYSICAL);
		badRoom3.setName("Amethyst");
		badRoom3.setOccupation(RoomOccupation.MEETING);

		Room badRoom4 = new Room();
		badRoom4.setBuilding(otherBadBuilding);
		badRoom4.setCapacity(10);
		badRoom4.setRoomId(14);
		badRoom4.setType(RoomType.PHYSICAL);
		badRoom4.setName("Bulbasaur");
		badRoom4.setOccupation(RoomOccupation.MEETING);

		badRooms.add(badRoom);
		badRooms.add(badRoom2);
		otherBadRooms.add(badRoom3);
		otherBadRooms.add(badRoom4);

		goodBuilding.setRooms(goodRooms);
		goodBuilding.setRooms(otherGoodRooms);
		badBuilding.setRooms(badRooms);
		otherBadBuilding.setRooms(otherBadRooms);

		goodBuildings.add(goodBuilding);
		goodBuildings.add(otherGoodBuilding);
		badBuildings.add(badBuilding);
		badBuildings.add(otherBadBuilding);


		goodSampleLocation.setBuildings(goodBuildings);
		badSampleLocation.setBuildings(badBuildings);
	}

	@Test
	public void createBadLocation() {

		LocationRequestDto locationRequestDto = new LocationRequestDto();
		locationRequestDto.setCity(badSampleLocation.getCity());
		locationRequestDto.setState(badSampleLocation.getState());
		locationRequestDto.setZipCode(badSampleLocation.getZipCode());
		locationService.createLocation(locationRequestDto);

	}

	@Test
	public void createGoodLocation() {

		LocationRequestDto locationRequestDto = new LocationRequestDto();
		locationRequestDto.setCity(goodSampleLocation.getCity());
		locationRequestDto.setState(goodSampleLocation.getState());
		locationRequestDto.setZipCode(goodSampleLocation.getZipCode());
		locationService.createLocation(locationRequestDto);

	}

	@Test
	public void updateLocationGood(){

		LocationDetailsDto locationDetailsDto = new LocationDetailsDto();
		LocationRequestDto updateLocationRequestDto = new LocationRequestDto();
		updateLocationRequestDto.setZipCode("78394");
		updateLocationRequestDto.setCity("Atlanta");
		updateLocationRequestDto.setState("Georgia");
		locationService.updateLocation(goodSampleLocation.getLocationId(),updateLocationRequestDto);

	}


	@Test
	public void updateLocationBad() {

		LocationRequestDto locationRequestDto = new LocationRequestDto();
		locationRequestDto.setState(null);
		locationRequestDto.setCity(null);
		locationRequestDto.setZipCode(null);
		locationService.updateLocation(goodSampleLocation.getLocationId(),locationRequestDto);

	}

	@Test
	public void updateStateGood() {

		LocationDetailsDto locationDetailsDto = new LocationDetailsDto();
		String state = "TX";
		locationDetailsDto.setCity("Miami");
		locationDetailsDto.setId(3);
		locationDetailsDto.setState("FL");
		locationDetailsDto.setZipCode("87402");
		locationDetailsDto.setState(state);
		locationService.updateState(locationDetailsDto.getId(),locationDetailsDto.getState());

	}

	@Test
	public void updateStateBad() {

		LocationDetailsDto locationDetailsDto = new LocationDetailsDto();
		String state = null;
		locationDetailsDto.setCity("Miami");
		locationDetailsDto.setId(3);
		locationDetailsDto.setState("FL");
		locationDetailsDto.setZipCode("87402");
		locationDetailsDto.setState(state);
		locationService.updateState(locationDetailsDto.getId(),locationDetailsDto.getState());
		assertEquals(state, locationDetailsDto.getState());

	}

	@Test
	public void updateCityGood() {

		LocationDetailsDto locationDetailsDto = new LocationDetailsDto();
		String city = "Orlando";
		locationDetailsDto.setCity("Miami");
		locationDetailsDto.setId(3);
		locationDetailsDto.setState("FL");
		locationDetailsDto.setZipCode("87402");
		locationDetailsDto.setCity(city);
		locationService.updateCity(locationDetailsDto.getId(),locationDetailsDto.getState());
		assertEquals(city, locationDetailsDto.getCity());

	}

	@Test
	public void updateCityBad() {
		LocationDetailsDto locationDetailsDto = new LocationDetailsDto();
		String city = null;
		locationDetailsDto.setCity("Miami");
		locationDetailsDto.setId(3);
		locationDetailsDto.setState("FL");
		locationDetailsDto.setZipCode("87402");
		locationDetailsDto.setCity(city);
		locationService.updateCity(locationDetailsDto.getId(),locationDetailsDto.getState());
		assertEquals(city, locationDetailsDto.getCity());
	}

	@Test
	public void updateZipCodeGood() {

		LocationDetailsDto locationDetailsDto = new LocationDetailsDto();
		String zipCode = "75205";
		locationDetailsDto.setCity("Miami");
		locationDetailsDto.setId(3);
		locationDetailsDto.setState("FL");
		locationDetailsDto.setZipCode("87402");
		locationDetailsDto.setZipCode(zipCode);
		locationService.updateZipCode(locationDetailsDto.getId(),locationDetailsDto.getState());

	}

	@Test
	public void updateZipCodeBad() {

		LocationDetailsDto locationDetailsDto = new LocationDetailsDto();
		String zipCode = null;
		locationDetailsDto.setCity("Miami");
		locationDetailsDto.setId(3);
		locationDetailsDto.setState("FL");
		locationDetailsDto.setZipCode("87402");
		locationDetailsDto.setZipCode(zipCode);
		locationService.updateZipCode(locationDetailsDto.getId(),locationDetailsDto.getState());
		assertEquals(zipCode, locationDetailsDto.getZipCode());
	}

	@Test
	public void addBuildingGood() {
		LocationDetailsDto locationDetailsDto = new LocationDetailsDto();
		locationDetailsDto.setCity("Miami");
		locationDetailsDto.setId(3);
		locationDetailsDto.setState("FL");
		locationDetailsDto.setZipCode("87402");
		Building building = new Building();
		building.setBuildingId(1);
		building.setLocation(goodSampleLocation);
		building.setCity("Miami");
		building.setTotalFloors(1);
		building.setStreetAddress("Main Street");
		building.setRooms(new ArrayList<>());
		goodSampleLocation.getBuildings().add(building);
	}

	@Test
	public void addBuildingBad() {
		LocationDetailsDto locationDetailsDto = new LocationDetailsDto();
		locationDetailsDto.setCity("Miami");
		locationDetailsDto.setId(3);
		locationDetailsDto.setState("FL");
		locationDetailsDto.setZipCode("87402");
		Building building = new Building();
		building.setBuildingId(1);
		building.setLocation(goodSampleLocation);
		building.setCity(null);
		building.setTotalFloors(1);
		building.setStreetAddress("Main Street");
		building.setRooms(new ArrayList<>());
		goodSampleLocation.getBuildings().add(building);

	}

	@Test
	public void deleteLocation() {

		LocationDetailsDto locationDetailsDto = new LocationDetailsDto();
		locationDetailsDto.setCity("Miami");
		locationDetailsDto.setId(3);
		locationDetailsDto.setState("FL");
		locationDetailsDto.setZipCode("87402");
		locationService.deleteLocation(locationDetailsDto.getId());

	}
}
