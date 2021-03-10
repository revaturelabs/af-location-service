package com.revature.service;

import java.util.ArrayList;
import java.util.List;
import com.revature.dto.*;
import com.revature.repository.LocationRepository;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;
import com.revature.model.Building;
import com.revature.model.Location;
import com.revature.model.Room;
import com.revature.statics.RoomOccupation;
import com.revature.statics.RoomType;

import static org.mockito.ArgumentMatchers.anyInt;

@RunWith(MockitoJUnitRunner.class)
public class LocationServiceTests {


	@InjectMocks
	private LocationServiceImpl locationService;

	@Mock
	private LocationRepository locationRepository;

	@Captor
	ArgumentCaptor<Location> locationArgumentCaptor;


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
		Mockito.verify(locationRepository, Mockito.times(1))
				.save(locationArgumentCaptor.capture());
		Assert.assertEquals(locationArgumentCaptor.getValue().getCity(), locationRequestDto.getCity());
		Assert.assertEquals(locationArgumentCaptor.getValue().getState(), locationRequestDto.getState());
		Assert.assertNull(locationArgumentCaptor.getValue().getZipCode());

	}

	@Test
	public void createGoodLocation() {

		LocationRequestDto locationRequestDto = new LocationRequestDto();
		locationRequestDto.setCity(goodSampleLocation.getCity());
		locationRequestDto.setState(goodSampleLocation.getState());
		locationRequestDto.setZipCode(goodSampleLocation.getZipCode());
		locationService.createLocation(locationRequestDto);
		Mockito.verify(locationRepository, Mockito.times(1))
				.save(locationArgumentCaptor.capture());
		Assert.assertEquals(locationArgumentCaptor.getValue().getZipCode(), locationRequestDto.getZipCode());
		Assert.assertEquals(locationArgumentCaptor.getValue().getCity(), locationRequestDto.getCity());
		Assert.assertEquals(locationArgumentCaptor.getValue().getState(), locationRequestDto.getState());

	}

	@Test
	public void updateLocationGood(){
		Mockito.when(locationRepository.findById(goodSampleLocation.getLocationId()))
				.thenReturn(java.util.Optional.of(goodSampleLocation));
		LocationRequestDto updateLocationRequestDto = new LocationRequestDto();
		updateLocationRequestDto.setZipCode("78394");
		updateLocationRequestDto.setCity("Atlanta");
		updateLocationRequestDto.setState("Georgia");
		locationService.updateLocation(goodSampleLocation.getLocationId()
				,updateLocationRequestDto);
		Mockito.verify(locationRepository, Mockito.times(1))
				.save(locationArgumentCaptor.capture());
		Assert.assertEquals(locationArgumentCaptor.getValue().getState(), updateLocationRequestDto.getState());
		Assert.assertEquals(locationArgumentCaptor.getValue().getCity(), updateLocationRequestDto.getCity());
		Assert.assertEquals(locationArgumentCaptor.getValue().getZipCode(), updateLocationRequestDto.getZipCode());

	}


	@Test
	public void updateLocationBad() {
		Mockito.when(locationRepository.findById(goodSampleLocation.getLocationId()))
				.thenReturn(java.util.Optional.of(goodSampleLocation));
		LocationRequestDto locationRequestDto = new LocationRequestDto();
		locationRequestDto.setState(null);
		locationRequestDto.setCity(null);
		locationRequestDto.setZipCode(null);
		locationService.updateLocation(goodSampleLocation.getLocationId(),locationRequestDto);
		Mockito.verify(locationRepository, Mockito.times(1))
				.save(locationArgumentCaptor.capture());
		Assert.assertNull(locationArgumentCaptor.getValue().getCity());
		Assert.assertNull(locationArgumentCaptor.getValue().getState());
		Assert.assertNull(locationArgumentCaptor.getValue().getZipCode());

	}

	@Test
	public void updateStateGood() {

		Mockito.when(locationRepository.findById(goodSampleLocation.getLocationId()))
				.thenReturn(java.util.Optional.of(goodSampleLocation));
		String state = "TX";
		locationService.updateState(goodSampleLocation.getLocationId(), state);
		Mockito.verify(locationRepository, Mockito.times(1))
				.save(locationArgumentCaptor.capture());
		Assert.assertEquals(state, locationArgumentCaptor.getValue().getState());

	}

	@Test
	public void updateStateBad() {

		Mockito.when(locationRepository.findById(goodSampleLocation.getLocationId()))
				.thenReturn(java.util.Optional.of(goodSampleLocation));
		String state = null;
		locationService.updateState(goodSampleLocation.getLocationId(), state);
		Mockito.verify(locationRepository, Mockito.times(1))
				.save(locationArgumentCaptor.capture());
		Assert.assertNull(locationArgumentCaptor.getValue().getState());

	}

	@Test
	public void updateCityGood() {

		Mockito.when(locationRepository.findById(goodSampleLocation.getLocationId()))
				.thenReturn(java.util.Optional.of(goodSampleLocation));
		String city = "Orlando";
		locationService.updateCity(goodSampleLocation.getLocationId(), city);
		Mockito.verify(locationRepository, Mockito.times(1))
				.save(locationArgumentCaptor.capture());
		Assert.assertEquals(city, locationArgumentCaptor.getValue().getCity());

	}

	@Test
	public void updateCityBad() {

		Mockito.when(locationRepository.findById(goodSampleLocation.getLocationId()))
				.thenReturn(java.util.Optional.of(goodSampleLocation));
		String city = null;
		locationService.updateCity(goodSampleLocation.getLocationId(), city);
		Mockito.verify(locationRepository, Mockito.times(1))
				.save(locationArgumentCaptor.capture());
		Assert.assertNull(locationArgumentCaptor.getValue().getCity());
	}

	@Test
	public void updateZipCodeGood() {

		Mockito.when(locationRepository.findById(goodSampleLocation.getLocationId()))
				.thenReturn(java.util.Optional.of(goodSampleLocation));
		String zipCode = "75205";
		locationService.updateZipCode(goodSampleLocation.getLocationId(), zipCode);
		Mockito.verify(locationRepository, Mockito.times(1))
				.save(locationArgumentCaptor.capture());
		Assert.assertEquals(zipCode, locationArgumentCaptor.getValue().getZipCode());

	}

	@Test
	public void updateZipCodeBad() {

		Mockito.when(locationRepository.findById(goodSampleLocation.getLocationId()))
				.thenReturn(java.util.Optional.of(goodSampleLocation));
		String zipCode = null;
		locationService.updateZipCode(goodSampleLocation.getLocationId(), zipCode);
		Mockito.verify(locationRepository, Mockito.times(1))
				.save(locationArgumentCaptor.capture());
		Assert.assertNull(locationArgumentCaptor.getValue().getZipCode());

	}

	@Test
	public void deleteLocation() {

		Mockito.doNothing().when(locationRepository).deleteById(goodSampleLocation.getLocationId());
		locationService.deleteLocation(goodSampleLocation.getLocationId());
		Mockito.verify(locationRepository, Mockito.times(1))
				.deleteById(goodSampleLocation.getLocationId());

	}

	@Test(expected = Exception.class)
	public void deleteLocationThatDoesNotExist() {

		Mockito.doThrow(Exception.class).when(locationRepository).deleteById(anyInt());
		locationService.deleteLocation(-1);
		Mockito.verify(locationRepository, Mockito.times(1)).deleteById(anyInt());

	}
}
