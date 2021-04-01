package com.revature.repos;

import com.revature.AFLocationService.AfLocationServiceApplication;
import com.revature.entities.Location;
import org.hibernate.exception.ConstraintViolationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sun.jvm.hotspot.utilities.Assert;

import java.util.*;

@SpringBootTest(classes= AfLocationServiceApplication.class)
public class LocationRepoTests {

    @Autowired
    LocationRepo locationRepo;

    @Test
    void create_location_test(){
        Location loc1 = new Location(0,"new test city","new test state", "new test zip");

        loc1 = this.locationRepo.save(loc1);

        Assertions.assertNotEquals(0,loc1.getLocationId());
    }

    @Test
    void get_all_locations_test(){
        List<Location> locations = (ArrayList<Location>)this.locationRepo.findAll();

        Assertions.assertTrue(locations.size()>1);
    }

    @Test
    void get_location_by_id(){
        Location location = this.locationRepo.findById(2).orElse(null);

        Assertions.assertTrue(location!=null);
    }

    @Test
    void update_location_by_id(){
        Location newLocation = new Location(1, "Updated city","updated state","updated zip");
        Location newLoc = this.locationRepo.save(newLocation);

        Assertions.assertEquals("Updated city", newLoc.getCity());
    }

    @Test
    void delete_location_by_id(){
        int id = 2;
        this.locationRepo.delete(this.locationRepo.findById(id).orElse(null));
        Location result = this.locationRepo.findById(id).orElse(null);
        Assertions.assertNull(result);
    }


}
