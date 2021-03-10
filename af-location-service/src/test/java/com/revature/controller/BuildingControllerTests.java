package com.revature.controller;

import com.revature.service.BuildingServiceImpl;
import com.revature.service.LocationServiceImpl;
import com.revature.service.RoomService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class BuildingControllerTests {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private LocationServiceImpl locationService;
    @MockBean
    private BuildingServiceImpl buildingService;
    @MockBean
    private RoomService roomService;

    @Test
    public void checkGetBuildingsAtLocationControllerValid() throws Exception {
        this.mockMvc.perform(get("/locations/{id}/buildings", "1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }

    @Test
    public void checkGetBuildingsAtLocationControllerInvalid() throws Exception {
        this.mockMvc.perform(get("/locations/{id}/buildings", "")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isMethodNotAllowed());
    }
	
}
