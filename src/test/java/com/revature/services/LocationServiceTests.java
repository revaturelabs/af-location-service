package com.revature.services;

import com.revature.AFLocationService.AfLocationServiceApplication;
import com.revature.entities.Location;
import com.revature.exceptions.LocationNotFoundException;
import com.revature.repos.LocationRepo;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest(classes = AfLocationServiceApplication.class)
@ExtendWith(MockitoExtension.class)
public class LocationServiceTests {

    @InjectMocks
    static LocationServiceImpl locationService;


    static Location testLocation;
    static List<Location> testLocationList;

    @Mock
    static LocationRepo locationRepo = Mockito.mock(LocationRepo.class);

    @BeforeAll
    static void setUp(){

        locationService = new LocationServiceImpl();


        testLocationList = new ArrayList<Location>();


       for(int i = 1;i<5;i++){
           Location location = new Location(i,"testcity"+i,"teststate"+i,"testzip"+i);
           if(i ==1){
               testLocation = location;
           }
           testLocationList.add(location);

       }

       Mockito.when(locationRepo.findAll()).thenReturn(testLocationList);
       Mockito.when(locationRepo.findById(1)).thenReturn(Optional.of(testLocation),Optional.empty());
       Mockito.when(locationRepo.save(testLocation)).thenReturn(testLocation);





    }

    @Order(1)
    @Test
    void create_location(){

        Location location = locationService.createLocation(testLocation);
        Assertions.assertNotNull(location);



    }

    @Order(2)
    @Test
    void get_location_by_id_test() {
        try {
            Location location = locationService.getLocationById(1);
            Assertions.assertNotNull(location);
            Assertions.assertEquals(1,location.getLocationId());

        }catch(LocationNotFoundException e){
            Assertions.fail();
        }


    }

    @Order(3)
    @Test
    void get_all_locations_test(){
        List<Location> locations = locationService.getAllLocations();

        Assertions.assertNotNull(locations);
        Assertions.assertTrue(locations.size()>1);

    }

    @Order(4)
    @Test
    void update_location_test(){

        Location location = testLocation;
        location.setCity("new test city");
        try {
            location = locationService.updateLocation(location);
            Assertions.assertNotNull(location);
            Assertions.assertEquals("new test city", location.getCity());

        }catch(LocationNotFoundException e){
            Assertions.fail();
        }
    }


    @Order(5)
    @Test
    void delete_location(){
        Assertions.assertTrue(locationService.deleteLocation(1));
    }




}
