package com.revature.services;

import com.revature.AFLocationService.AfLocationServiceApplication;
import com.revature.repos.BuildingRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest(classes = AfLocationServiceApplication.class)
@ExtendWith(MockitoExtension.class)
public class BuildingServiceTests {

    BuildingService buildingService;

    @MockBean
    BuildingRepo buildingrepo;

    @Test
    void testIfTestsCanRun() {
        Assertions.assertTrue(true);
    }
}
