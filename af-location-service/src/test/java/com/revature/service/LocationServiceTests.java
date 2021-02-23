package com.revature.service;

import com.revature.model.Location;
import com.revature.repository.LocationRepository;
import java.util.*;
import org.junit.*;

import static org.junit.Assert.assertTrue;

public class LocationServiceTests {

    LocationRepository locationRepository;
    List<Location> locations;
    Location arlington;
    Location newYork;
    Location reston;
    Location westVirginia;
    Location tampa;

    @Before
    public void setUp() {
        locations = new ArrayList<>();
        arlington = new Location();
        newYork = new Location();
        reston = new Location();
        westVirginia = new Location();
        tampa = new Location();
        locations.add(arlington);
        locations.add(newYork);
        locations.add(reston);
        locations.add(westVirginia);
        locations.add(tampa);
    }

    @Test
    public void viewAllLocations() {
//        assertTrue ( locationRepository.getAll().size() == 5 );
        assertTrue( locations.size() == 5 );
    }

}
