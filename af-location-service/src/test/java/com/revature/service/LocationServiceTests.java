package com.revature.service;

<<<<<<< HEAD
import com.revature.dto.LocationDto;
import com.revature.model.Building;
import com.revature.model.Location;
import com.revature.model.Room;
import com.revature.repository.LocationRepository;
import com.revature.statics.RoomOccupation;
import com.revature.statics.RoomType;
=======
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
<<<<<<< HEAD
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;


import static org.junit.Assert.*;

import java.util.Iterator;


=======
import org.mockito.stubbing.Answer;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
import com.revature.dto.BuildingDto;
import com.revature.dto.LocationDto;
import com.revature.dto.RoomDto;
import com.revature.model.Building;
import com.revature.model.Location;
import com.revature.model.Room;
import com.revature.repository.LocationRepository;
import com.revature.statics.RoomOccupation;
import com.revature.statics.RoomType;

<<<<<<< HEAD

=======
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
@RunWith(MockitoJUnitRunner.class)
public class LocationServiceTests {

	@Autowired
	LocationService locationService;
<<<<<<< HEAD
	LocationRepository locationRepository = Mockito.mock( LocationRepository.class );
	BuildingService buildingService = Mockito.mock( BuildingService.class );
=======
	LocationRepository locationRepository = Mockito.mock(LocationRepository.class);
	BuildingService buildingService = Mockito.mock(BuildingService.class);
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
	public static Location goodSampleLocation;
	public static Location badSampleLocation;

	@BeforeClass
	public static void setup() {
<<<<<<< HEAD
		//instantiate location
		goodSampleLocation = new Location();
		badSampleLocation = new Location();
		goodSampleLocation.setCity( "Miami" );
		badSampleLocation.setCity( "Austin" );
		goodSampleLocation.setId(3);
		badSampleLocation.setId(2);
		goodSampleLocation.setState("FL");
		badSampleLocation.setState("CA");
		//instantiate building list
		List<Building> goodBuildings = new ArrayList ();
		List<Building> badBuildings = new ArrayList();
=======
		// instantiate location
		goodSampleLocation = new Location();
		badSampleLocation = new Location();
		goodSampleLocation.setCity("Miami");
		badSampleLocation.setCity("Austin");
		goodSampleLocation.setLocationId(3);
		badSampleLocation.setLocationId(2);
		goodSampleLocation.setState("FL");
		badSampleLocation.setState("CA");
		// instantiate building list
		List<Building> goodBuildings = new ArrayList<Building>();
		List<Building> badBuildings = new ArrayList<Building>();
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
		goodSampleLocation.setBuildings(goodBuildings);
		badSampleLocation.setBuildings(badBuildings);
		// instantiate buildings
		Building goodBuilding = new Building();
		goodBuilding.setCity("Miami");
<<<<<<< HEAD
		goodBuilding.setId(23);
=======
		goodBuilding.setBuildingId(23);
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
		goodBuilding.setLocation(goodSampleLocation);
		goodBuilding.setStreetAddress("Main Street");
		Building otherGoodBuilding = new Building();
		otherGoodBuilding.setCity("Miami");
<<<<<<< HEAD
		otherGoodBuilding.setId(24);
=======
		otherGoodBuilding.setBuildingId(24);
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
		otherGoodBuilding.setLocation(goodSampleLocation);
		otherGoodBuilding.setStreetAddress("Main Street");
		goodSampleLocation.setBuildings(goodBuildings);
		Building badBuilding = new Building();
		badBuilding.setCity("Austin");
<<<<<<< HEAD
		badBuilding.setId(25);
=======
		badBuilding.setBuildingId(25);
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
		badBuilding.setLocation(badSampleLocation);
		badBuilding.setStreetAddress("Main Street");
		Building otherBadBuilding = new Building();
		otherBadBuilding.setCity("Austin");
<<<<<<< HEAD
		otherBadBuilding.setId(26);
=======
		otherBadBuilding.setBuildingId(26);
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
		otherBadBuilding.setLocation(badSampleLocation);
		otherBadBuilding.setStreetAddress("Main Street");
		goodBuildings.add(goodBuilding);
		goodBuildings.add(otherGoodBuilding);
		badBuildings.add(badBuilding);
		badBuildings.add(otherBadBuilding);
<<<<<<< HEAD
		//instantiate rooms
		
=======
		// instantiate rooms

>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
		List<Room> goodRooms = new ArrayList<Room>();
		List<Room> otherGoodRooms = new ArrayList<Room>();
		goodBuilding.setRooms(goodRooms);
		goodBuilding.setRooms(otherGoodRooms);
		Room goodRoom = new Room();
		goodRoom.setBuilding(goodBuilding);
		goodRoom.setCapacity(3);
<<<<<<< HEAD
		goodRoom.setId(7);
		goodRoom.setType( RoomType.PHYSICAL);
		goodRoom.setName("James");
		goodRoom.setOccupation( RoomOccupation.MEETING);
		Room goodRoom2 = new Room();
		goodRoom2.setBuilding(goodBuilding);
		goodRoom2.setCapacity(4);
		goodRoom2.setId(8);
=======
		goodRoom.setRoomId(7);
		goodRoom.setType(RoomType.PHYSICAL);
		goodRoom.setName("James");
		goodRoom.setOccupation(RoomOccupation.MEETING);
		Room goodRoom2 = new Room();
		goodRoom2.setBuilding(goodBuilding);
		goodRoom2.setCapacity(4);
		goodRoom2.setRoomId(8);
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
		goodRoom2.setType(RoomType.PHYSICAL);
		goodRoom2.setName("Steven");
		goodRoom2.setOccupation(RoomOccupation.MEETING);
		Room goodRoom3 = new Room();
		goodRoom3.setBuilding(otherGoodBuilding);
		goodRoom3.setCapacity(5);
<<<<<<< HEAD
		goodRoom3.setId(9);
=======
		goodRoom3.setRoomId(9);
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
		goodRoom3.setType(RoomType.PHYSICAL);
		goodRoom3.setName("Pearl");
		goodRoom3.setOccupation(RoomOccupation.MEETING);
		Room goodRoom4 = new Room();
		goodRoom4.setBuilding(otherGoodBuilding);
		goodRoom4.setCapacity(6);
<<<<<<< HEAD
		goodRoom4.setId(10);
=======
		goodRoom4.setRoomId(10);
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
		goodRoom4.setType(RoomType.PHYSICAL);
		goodRoom4.setName("Walter");
		goodRoom4.setOccupation(RoomOccupation.MEETING);
		goodRooms.add(goodRoom);
		goodRooms.add(goodRoom2);
		otherGoodRooms.add(goodRoom3);
		otherGoodRooms.add(goodRoom4);
<<<<<<< HEAD
		
		List<Room> badRooms = new ArrayList<Room>();
		List<Room> otherBadRooms = new ArrayList();
=======

		List<Room> badRooms = new ArrayList<Room>();
		List<Room> otherBadRooms = new ArrayList<Room>();
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
		badBuilding.setRooms(badRooms);
		otherBadBuilding.setRooms(otherBadRooms);
		Room badRoom = new Room();
		badRoom.setBuilding(badBuilding);
		badRoom.setCapacity(7);
<<<<<<< HEAD
		badRoom.setId(11);
=======
		badRoom.setRoomId(11);
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
		badRoom.setType(RoomType.PHYSICAL);
		badRoom.setName("Blathers");
		badRoom.setOccupation(RoomOccupation.MEETING);
		Room badRoom2 = new Room();
		badRoom2.setBuilding(badBuilding);
		badRoom2.setCapacity(8);
<<<<<<< HEAD
		badRoom2.setId(12);
=======
		badRoom2.setRoomId(12);
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
		badRoom2.setType(RoomType.PHYSICAL);
		badRoom2.setName("Garnet");
		badRoom2.setOccupation(RoomOccupation.MEETING);
		Room badRoom3 = new Room();
		badRoom3.setBuilding(otherBadBuilding);
		badRoom3.setCapacity(9);
<<<<<<< HEAD
		badRoom3.setId(13);
=======
		badRoom3.setRoomId(13);
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
		badRoom3.setType(RoomType.PHYSICAL);
		badRoom3.setName("Amethyst");
		badRoom3.setOccupation(RoomOccupation.MEETING);
		Room badRoom4 = new Room();
		badRoom4.setBuilding(otherBadBuilding);
		badRoom4.setCapacity(10);
<<<<<<< HEAD
		badRoom4.setId(14);
=======
		badRoom4.setRoomId(14);
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
		badRoom4.setType(RoomType.PHYSICAL);
		badRoom4.setName("Bulbasaur");
		badRoom4.setOccupation(RoomOccupation.MEETING);
		badRooms.add(badRoom);
		badRooms.add(badRoom2);
		otherBadRooms.add(badRoom3);
		otherBadRooms.add(badRoom4);
<<<<<<< HEAD
		
		
		
		
		
	
	}
	
	@Test
	public void createBadLocation() {
		LocationDto badSampleLocationDto = new LocationDto();
		// TODO instantiation
		Mockito.when(locationRepository.findById(badSampleLocationDto.getId())).thenReturn( Optional.empty());
		Mockito.when(locationRepository.save(badSampleLocation)).thenAnswer(new Answer<Location> () {
			@Override
			public Location answer( InvocationOnMock invocation) throws Throwable {
				Location location = invocation.getArgument(0, Location.class);
				if(location.getId() == badSampleLocation.getId()) {
					throw new Exception("bad entity");
				}
				return null;
			}
		});
		Exception exception = assertThrows(Exception.class, () ->{
			locationService.createLocation(badSampleLocationDto);
		});
		assertTrue("bad entity".contains(exception.getMessage()));
	}
	
	@Test
	public void createGoodLocation() {
		LocationDto goodSampleLocationDto = new LocationDto();
		// TODO instantiation 
		Mockito.when(locationRepository.findById(goodSampleLocationDto.getId())).thenReturn(Optional.of(goodSampleLocation));
		locationService.createLocation( goodSampleLocationDto );
		LocationDto result = locationService.getLocation( goodSampleLocationDto.getId() );
		assertFalse( "Didn't find location in repository", result == null );
		assertEquals( result.getCity(), goodSampleLocationDto.getCity(), "city didn't match" );
		assertEquals( result.getState(),goodSampleLocationDto.getState(), "state didn't match" );
		assertEquals( result.getZipCode(),goodSampleLocationDto.getZipCode(),"zip code didn't match" );
		assertTrue( "Building Lists not the same size", result.getBuildings().size() == goodSampleLocationDto.getBuildings().size() );
		Iterator<BuildingDto> iteratorSample = goodSampleLocationDto.getBuildings().iterator();
		Iterator<BuildingDto> iteratorResult = result.getBuildings().iterator();
		while( iteratorSample.hasNext () ) {
			BuildingDto buildingSample = iteratorSample.next();
			BuildingDto buildingResult = iteratorResult.next();
			assertEquals( buildingSample.city,buildingResult.city, "city doesn't match" );
			assertTrue( "id doesn't match", buildingSample.id == buildingResult.id);
			assertEquals( buildingSample.streetAddress,buildingResult.streetAddress, "address doesn't match" );
			assertTrue( "Room list not the same size", buildingSample.rooms.size() == buildingResult.rooms.size() );
			Iterator<RoomDto> iteratorSampleRoom = buildingSample.rooms.iterator();
			Iterator<RoomDto> iteratorResultRoom = buildingResult.rooms.iterator();
			while( iteratorSampleRoom.hasNext() ) {
				RoomDto sampleRoom = iteratorSampleRoom.next();
				RoomDto resultRoom = iteratorResultRoom.next();
				assertTrue( "capacity doesn't match", sampleRoom.capacity == resultRoom.capacity );
				assertEquals(sampleRoom.name, resultRoom.name, "name doesn't match for room");
				assertTrue("id doesn't match", sampleRoom.id == resultRoom.id);
				assertEquals(sampleRoom.type, resultRoom.type, "type doesn't match for room");
				assertEquals(sampleRoom.occupation, resultRoom.occupation, "occupation doesn't match for room");
			}
		}
	}
	
	@Test
	public void checkToSeeIfWeGetBuildingsAtLocation() {
		Location loc = new Location();
		assertNotNull(loc);
		assertNotNull(loc.getBuildings());
		assertEquals("what is received from the list of buildings is not a building object list", loc.getBuildings(), Building.class);
=======

	}

	@Test
	public void createBadLocation() {
		Mockito.when( locationRepository.save( badSampleLocation ) ).thenAnswer (new Answer<Location>() {
			@Override
			public Location answer( InvocationOnMock invocation ) throws Throwable {
				Location location = invocation.getArgument(0, Location.class);
				if( location.getLocationId() == badSampleLocation.getLocationId() ) {
					throw new Exception( "bad entity" );
				}
				return null;
			}
		} );
		Exception exception = assertThrows( Exception.class, () ->{
			locationService.createLocation( badSampleLocation );
		} );
		assertTrue( "didn't throw exception", "bad entity".contains( exception.getMessage() ) );
	}

	@Test
	public void createGoodLocation() {
		LocationDto goodSampleLocationDto = getLocationDtoFromEntity( goodSampleLocation ); 
		Mockito.when(locationRepository.findById( goodSampleLocationDto.id ) ).thenReturn(Optional.of( goodSampleLocation ) );
		locationService.createLocation( goodSampleLocation );
		LocationDto result = locationService.getLocation( goodSampleLocationDto.id );
		assertTrue( "locationDto's not equal", locationDtoEquals( goodSampleLocationDto, result ) );
	}

	@Test
	public void checkGetBuildingsAtLocation() {
		List<Building> buildingList = goodSampleLocation.getBuildings();
		Location testLocation = new Location();
		Building testBuilding = new Building();
		testBuilding.setCity("Miami");
		testBuilding.setBuildingId(23);
		testBuilding.setLocation(testLocation);
		testBuilding.setStreetAddress("Main Street");
		Building testBuilding2 = new Building();
		testBuilding2.setCity("Miami");
		testBuilding2.setBuildingId(24);
		testBuilding2.setLocation(testLocation);
		testBuilding2.setStreetAddress("Main Street");
		assertNotNull(buildingList);
		assertTrue(buildingList.size() == 2);
		assertTrue(buildingList.get(0).equals(testBuilding));
		assertTrue(buildingList.get(1).equals(testBuilding2));
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
	}

	@Test
	public void checkWeCanGetAllLocations() {
		List<LocationDto> locations = locationService.getAllLocations();
		assertNotNull(locations);
		assertTrue(locations.size() == 5);
	}

	@Test
	public void checkWeCanGetLocationsByState() {
		boolean result = true;
		String state = "Virginia";
		List<LocationDto> locations = locationService.getLocationsByState(state);
<<<<<<< HEAD
		for(LocationDto ld : locations) {
			if(!ld.getState().equals(state)) {
=======
		for (LocationDto ld : locations) {
			if (!ld.state.equals(state)) {
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
				result = false;
			}
		}
		assertTrue(result);
	}

	@Test
	public void checkWeCanGetLocationsByCity() {
		boolean result = true;
		String city = "Reston";
		List<LocationDto> locations = locationService.getLocationsByCity(city);
<<<<<<< HEAD
		for(LocationDto ld : locations) {
			if(!ld.getCity().equals(city)) {
=======
		for (LocationDto ld : locations) {
			if (!ld.city.equals(city)) {
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
				result = false;
			}
		}
		assertTrue(result);
	}

	@Test
	public void checkWeCanGetLocationsByZipcode() {
		boolean result = true;
		String zipcode = "20190";
		List<LocationDto> locations = locationService.getLocationsByZipCode(zipcode);
<<<<<<< HEAD
		for(LocationDto ld : locations) {
			if(!ld.getZipCode().equals(zipcode)) {
=======
		for (LocationDto ld : locations) {
			if (!ld.zipCode.equals(zipcode)) {
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
				result = false;
			}
		}
		assertTrue(result);
	}
<<<<<<< HEAD
=======
	
	
	@Test 
	public void updateLocationGood(){
		final Location goodSampleCopy = cloneLocation( goodSampleLocation );
		Location modifiedSampleCopy = cloneLocation( goodSampleCopy);
		modifiedSampleCopy.setCity( "wuzz" );
		//TODO check validation
		Mockito.when( locationRepository.save( modifiedSampleCopy )).thenAnswer( new Answer() {
			@Override
			public Location answer (InvocationOnMock invocation )  {
				Location location = invocation.getArgument( 0, Location.class );
				if( location.getLocationId() == goodSampleCopy.getLocationId() ) {
					goodSampleCopy.setBuildings( location.getBuildings() );
					goodSampleCopy.setCity( location.getCity() );
					goodSampleCopy.setState( location.getState() );
					goodSampleCopy.setZipcode( location.getZipcode() );
				}
				return goodSampleCopy;
			}
		} );
		locationService.updateLocation( goodSampleCopy.getLocationId(), modifiedSampleCopy );
		Mockito.when( locationRepository.findById( goodSampleCopy.getLocationId()) ).thenReturn( ( Optional.of( goodSampleCopy ) ) );
		LocationDto result = locationService.getLocation( goodSampleCopy.getLocationId() );
		assertTrue( "Location not persisted", locationDtoEquals( result, getLocationDtoFromEntity(modifiedSampleCopy) ) );
	}
	@Test 
	public void updateLocationBad() {
		Location badSampleCopy = cloneLocation( goodSampleLocation );
		// TODO update for validation rules
		badSampleCopy.setCity( "badValue" );
		Mockito.when( locationRepository.save( badSampleCopy ) ).thenAnswer( new Answer<Location>() {
			@Override
			public Location answer( InvocationOnMock invocation ) throws Throwable {
				Location location = invocation.getArgument( 0, Location.class );
				if( location.getLocationId() == badSampleLocation.getLocationId() ) {
					throw new Exception( "bad entity" );
				}
				return null;
			}
		} );
		Exception exception = assertThrows( Exception.class, () ->{
			locationService.updateLocation( badSampleCopy.getLocationId(), badSampleCopy );
		} );
		assertTrue( "didn't throw exception", "bad entity".contains( exception.getMessage() ) );
	}
	
	@Test
	public void updateStateGood() {
		Location goodSampleCopy = cloneLocation( goodSampleLocation );	
		//TODO check validation
		Mockito.when( locationRepository.save( goodSampleCopy )).thenReturn( goodSampleCopy );
		Mockito.when( locationRepository.findById( goodSampleCopy.getLocationId() ) ).thenReturn( ( Optional.of( goodSampleCopy ) ) );
		locationService.updateState( goodSampleCopy.getLocationId(), "wuzz" );
		LocationDto result = locationService.getLocation(goodSampleCopy.getLocationId());
		assertTrue( "state not persisted", "wuzz".equals( result.state ) );
	}
	@Test
	public void updateStateBad() {
		{
			Location goodSampleCopy = cloneLocation( goodSampleLocation );	
			//TODO check validation
			Mockito.when( locationRepository.save( goodSampleCopy )).thenReturn( goodSampleCopy );
			Mockito.when( locationRepository.findById( goodSampleCopy.getLocationId() ) ).thenReturn( ( Optional.of( goodSampleCopy ) ) );
			locationService.updateState( goodSampleCopy.getLocationId(), "wuzz" );
			LocationDto result = locationService.getLocation( goodSampleCopy.getLocationId() );
			assertFalse( "bad state changed", "wuzz".equals( result.state ) );
		}
		
	}
	
	@Test
	public void updateCityGood() {
		Location goodSampleCopy = cloneLocation( goodSampleLocation );	
		//TODO check validation
		Mockito.when( locationRepository.save( goodSampleCopy )).thenReturn( goodSampleCopy );
		Mockito.when( locationRepository.findById( goodSampleCopy.getLocationId() ) ).thenReturn( ( Optional.of( goodSampleCopy ) ) );
		locationService.updateCity( goodSampleCopy.getLocationId(), "wuzz" );
		LocationDto result = locationService.getLocation( goodSampleCopy.getLocationId() );
		assertTrue( "city not persisted", "wuzz".equals( result.city ) );
	}
	
	@Test
	public void updateCityBad() {
		Location goodSampleCopy = cloneLocation( goodSampleLocation );	
		//TODO check validation
		Mockito.when( locationRepository.save( goodSampleCopy )).thenReturn( goodSampleCopy );
		Mockito.when( locationRepository.findById( goodSampleCopy.getLocationId() ) ).thenReturn( ( Optional.of( goodSampleCopy ) ) );
		locationService.updateCity( goodSampleCopy.getLocationId(), "wuzz" );
		LocationDto result = locationService.getLocation( goodSampleCopy.getLocationId() );
		assertFalse( "city should not persist", "wuzz".equals( result.city ) );
	}
	
	@Test
	public void updateZipCodeGood() {
		Location goodSampleCopy = cloneLocation( goodSampleLocation );	
		//TODO check validation
		Mockito.when( locationRepository.save( goodSampleCopy )).thenReturn( goodSampleCopy );
		Mockito.when( locationRepository.findById( goodSampleCopy.getLocationId() ) ).thenReturn( ( Optional.of( goodSampleCopy ) ) );
		locationService.updateZipCode( goodSampleCopy.getLocationId(), "wuzz" );
		LocationDto result = locationService.getLocation( goodSampleCopy.getLocationId() );
		assertTrue( "zip code not persisted", "wuzz".equals( result.zipCode ) );
	}
	@Test
	public void updateZipCodeBad() {
		Location goodSampleCopy = cloneLocation( goodSampleLocation );	
		//TODO check validation
		Mockito.when( locationRepository.save( goodSampleCopy )).thenReturn( goodSampleCopy );
		Mockito.when( locationRepository.findById( goodSampleCopy.getLocationId() ) ).thenReturn( ( Optional.of( goodSampleCopy ) ) );
		locationService.updateZipCode( goodSampleCopy.getLocationId(), "wuzz" );
		LocationDto result = locationService.getLocation( goodSampleCopy.getLocationId() );
		assertFalse( "zip code should not persist", "wuzz".equals( result.zipCode ) );
	}
	
	@Test
	public void addBuildingGood() {
		Location goodSampleCopy = cloneLocation( goodSampleLocation );
		Building newBuilding = new Building();
		newBuilding.setCity( "Riverdale" );
		newBuilding.setBuildingId( 123456 );
		newBuilding.setLocation( goodSampleCopy );
		newBuilding.setRooms( goodSampleCopy.getBuildings().get(0).getRooms() );
		newBuilding.setStreetAddress( "WEEEEEEEE" );
		//TODO check validation
		
		Mockito.when( locationRepository.save( goodSampleCopy )).thenReturn( goodSampleCopy );
		Mockito.when( locationRepository.findById( goodSampleCopy.getLocationId() ) ).thenReturn( ( Optional.of( goodSampleCopy ) ) );
		locationService.addBuilding( goodSampleCopy.getLocationId(), getBuildingDtoFromEntity( newBuilding ) );
		LocationDto result = locationService.getLocation( goodSampleCopy.getLocationId() );
		boolean flag = false;
		Iterator<BuildingDto> iterator = result.buildings.iterator();
		BuildingDto newBuildingDto = getBuildingDtoFromEntity( newBuilding );
		while( iterator.hasNext() ) {
			if( BuildingDtoEquals( iterator.next(), newBuildingDto ) ) {
				flag = true;
				break;
			}
		}
		assertTrue( "building not added", flag );
	}
	
	@Test
	public void addBuildingBad() {
		Location goodSampleCopy = cloneLocation( goodSampleLocation );
		Building newBuilding = new Building();
		newBuilding.setCity( "Riverdale" );
		newBuilding.setBuildingId( 123456 );
		newBuilding.setLocation( goodSampleCopy );
		newBuilding.setRooms( goodSampleCopy.getBuildings().get(0).getRooms() );
		newBuilding.setStreetAddress( "WEEEEEEEE" );
		//TODO check validation
		
		Mockito.when( locationRepository.save( goodSampleCopy )).thenReturn( goodSampleCopy );
		Mockito.when( locationRepository.findById( goodSampleCopy.getLocationId() ) ).thenReturn( ( Optional.of( goodSampleCopy ) ) );
		locationService.addBuilding( goodSampleCopy.getLocationId(), getBuildingDtoFromEntity( newBuilding ) );
		LocationDto result = locationService.getLocation( goodSampleCopy.getLocationId() );
		boolean flag = false;
		Iterator<BuildingDto> iterator = result.buildings.iterator();
		BuildingDto newBuildingDto = getBuildingDtoFromEntity(newBuilding);
		while(iterator.hasNext()) {
			if( BuildingDtoEquals( iterator.next(), newBuildingDto ) ) {
				flag = true;
				break;
			}
		}
		assertFalse("building added", flag);
	}
	
	@Test
	public void deleteLocation() {
		final Location goodCopy = cloneLocation(goodSampleLocation);
		final boolean[] flag = {false};
		
		Mockito.doAnswer( new Answer<Object>() {
			@Override
			public Object answer( InvocationOnMock invocation ) throws Throwable {
				Location location = invocation.getArgument(0);
				if( location.getLocationId() == goodCopy.getLocationId() ) {
					flag[0] = true;
				}
				return null;
			}
			
		}).when( locationRepository ).delete( goodCopy );;
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b

		Mockito.when( locationRepository.findById( goodCopy.getLocationId() ) ).thenAnswer( new Answer<Location>() {
			@Override
			public Location answer( InvocationOnMock invocation ) throws Throwable {
				Location location = invocation.getArgument( 0, Location.class );
				if( location.getLocationId() == goodCopy.getLocationId() && flag[0] ) {
					throw new Exception( "entity not found" );
				}
				return null;
			}
		});
		Exception exception = assertThrows( Exception.class, () ->{
			locationService.deleteLocation( goodCopy.getLocationId() );
		} );
		assertTrue( "didn't throw exception", "entity not found".contains( exception.getMessage() ) );
	}
	
	
	//utility functions
	
		private Location cloneLocation( Location location ) {
			Location result = new Location();
			result.setCity( location.getCity() );
			result.setLocationId( location.getLocationId() );
			result.setState( location.getState() );
			result.setZipcode( location.getZipcode() );
			List<Building> list = new ArrayList<Building>();
			Iterator<Building> iterator = location.getBuildings().iterator();
			while( iterator.hasNext() ) {
				list.add( iterator.next() );
			}
			result.setBuildings( list );
			return result;
		}
		
		private boolean locationDtoEquals( LocationDto locationA, LocationDto locationB ) {
			if( locationA == locationB ) {
				return true;
			}
			if( locationA.id != locationB.id ) {
				return false;
			}
			if( !locationA.city.equals( locationB.city ) ) {
				return false;
			}
			if( !locationA.state.equals( locationB.state ) ) {
				return false;
			}
			if( !locationA.zipCode.equals( locationB.zipCode ) ) {
				return false;
			}
			if( locationA.buildings.size() != locationB.buildings.size() ) {
				return false;
			}
			Iterator<BuildingDto> iteratorA = locationA.buildings.iterator();
			Iterator<BuildingDto> iteratorB = locationB.buildings.iterator();
			while( iteratorA.hasNext() ) {
				if( !BuildingDtoEquals( iteratorA.next(), iteratorB.next() ) ) {
					return false;
				}
			}
			return true;
			
		}
		private boolean roomDtoEquals( RoomDto roomA, RoomDto roomB) {
			if( roomA == roomB ) {
				return true;
			}
			if( roomA.id != roomB.id ) {
				return false;
			}
			if( roomA.capacity != roomB.capacity ) {
				return false;
			}
			if( !roomA.name.equals( roomB.name ) ) {
				return false;
			}
			if( !roomA.occupation.equals( roomB.occupation ) ) {
				return false;
			}
			if( !roomA.type.equals( roomB.type ) ) {
				return false;
			}
			
			return true;
		}
		
		private boolean BuildingDtoEquals( BuildingDto buildingA, BuildingDto buildingB ) {
			if( buildingA == buildingB ) {
				return true;
			}
			if( !buildingA.city.equals( buildingB.city ) ) {
				return false;
			}
			if( !buildingA.streetAddress.equals( buildingB.streetAddress ) ) {
				return false;
			}
			if( buildingA.id != buildingB.id ) {
				return false;
			}
			if( buildingA.rooms.size() != buildingB.rooms.size() ) {
				return false;
			}
			Iterator<RoomDto> iteratorRoomsA = buildingA.rooms.iterator();
			Iterator<RoomDto> iteratorRoomsB = buildingB.rooms.iterator();
			while(iteratorRoomsA.hasNext()) {
				if( !roomDtoEquals( iteratorRoomsA.next(),iteratorRoomsB.next() ) ) {
					return false;
				}
			}
			return true;
		}
		
		private LocationDto getLocationDtoFromEntity( Location location ) {
			LocationDto locationDto = new LocationDto();
			locationDto.city = location.getCity();
			locationDto.id = location.getLocationId();
			locationDto.state = location.getState();
			locationDto.zipCode = location.getZipcode();
			locationDto.buildings = this.getBuidlingDtoListFromEntityList( location.getBuildings() );
			return locationDto;
		}
		private BuildingDto getBuildingDtoFromEntity( Building building ) {
			BuildingDto resultBuilding = new BuildingDto();
			resultBuilding.city = building.getCity();
			resultBuilding.id = building.getBuildingId();
			resultBuilding.streetAddress = building.getStreetAddress();
			resultBuilding.rooms = getRoomsDtoListFromEntityList( building.getRooms() );
			return resultBuilding;
		}
		private List<BuildingDto>   getBuidlingDtoListFromEntityList( List<Building> buildings ){
			List<BuildingDto> result = new ArrayList<BuildingDto>();
			Iterator<Building> iterator = buildings.iterator();
			while( iterator.hasNext() ) {
				BuildingDto resultBuilding = new BuildingDto();
				Building building = iterator.next();
				resultBuilding = getBuildingDtoFromEntity( building );
				result.add( resultBuilding );
			}
			return result;
		}
		private List<RoomDto> getRoomsDtoListFromEntityList( List<Room> rooms ){
			List<RoomDto> result = new ArrayList<RoomDto>();
			Iterator<Room> iterator = rooms.iterator();
			while( iterator.hasNext() ) {
				RoomDto resultRoom = new RoomDto();
				Room room = iterator.next();
				resultRoom.capacity = room.getCapacity();
				resultRoom.id = room.getRoomId();
				resultRoom.name = room.getName();
				// TODO implement conversion of occupation and type string to and from enum
//				resultRoom.occupation = room.getOccupation();
//				resultRoom.type = room.getType()
				result.add( resultRoom );
			}
			return result;
		}
}