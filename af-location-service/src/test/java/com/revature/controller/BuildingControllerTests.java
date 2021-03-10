package com.revature.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.revature.service.BuildingService;


@RunWith(SpringRunner.class)
@WebMvcTest(BuildingController.class)
public class BuildingControllerTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	BuildingService buildingService;
	
	@Test
	public void getAllLocations() throws Exception{
		mockMvc.perform(get("/building").contentType(MediaType.APPLICATION_JSON).content("{}")).andExpect(status().isOk());
	}
	@Test
	public void getAllLocationsUnauthorized() throws Exception{
		mockMvc.perform(get("/building/").contentType(MediaType.APPLICATION_JSON).content("{}")).andExpect(status().isUnauthorized());
	}
	@Test 
	public void getBuildingsByCity() throws Exception {
		mockMvc.perform(get("/building/city/{city}/","Miami").contentType(MediaType.APPLICATION_JSON).content("{}")).andExpect(status().isOk());
	}
	@Test
	public void getBuildingsByCityUnauthorized() throws Exception {
		mockMvc.perform(get("/building/city/{city}/", "Miami").contentType(MediaType.APPLICATION_JSON).content("{}")).andExpect(status().isUnauthorized());
	}
	@Test
	public void getBuildingsByAddress() throws Exception {
		mockMvc.perform(get("/building/street/{address}/", "Main%20Street").contentType(MediaType.APPLICATION_JSON).content("{}")).andExpect(status().isOk());
	}
	@Test
	public void getBuildingsByAddressUnauthorized() throws Exception {
		mockMvc.perform(get("/building/street/{address}/", "Main%20Street").contentType(MediaType.APPLICATION_JSON).content("{}")).andExpect(status().isUnauthorized());
	}
	@Test
	public void getBuildingsById() throws Exception {
		mockMvc.perform(get("/building/{id}/", "1").contentType(MediaType.APPLICATION_JSON).content("{}")).andExpect(status().isOk());
	}
	@Test
	public void getBuildingsByIdUnauthorized() throws Exception {
		mockMvc.perform(get("/building/{id}/", "1").contentType(MediaType.APPLICATION_JSON).content("{}")).andExpect(status().isUnauthorized());
	}
	@Test
	public void updateBuildingCity() throws Exception {
		mockMvc.perform(patch("/building/city/{id}/{city}/", "1","plano").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
	}
	@Test
	public void updateBuildingCityUnauthorized() throws Exception {
		mockMvc.perform(patch("/building/city/{id}/{cityName}/","1","Plano").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isUnauthorized());
	}
	@Test
	public void updateBuildingZipCode() throws Exception {
		mockMvc.perform(patch("/building/zipCode/{id}/{zip}/", "1", "33177").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
	}
	@Test
	public void updateBuildingZipCodeUnauthorized() throws Exception {
		mockMvc.perform(patch("/building/zipCode/{id}/{zip}/", "1","33177").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isUnauthorized());

	}
	@Test
	public void updateNumberOfFloors() throws Exception {
		mockMvc.perform(patch("/building/floors/{id}/{count}", "1","2").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
	}
	@Test
	public void updateNumberOfFloorsUnauthorized() throws Exception {
		mockMvc.perform(patch("/building/floors/{id}/{count}", "1","2").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isUnauthorized());
	}
	
	public void addRoom() throws Exception{
		mockMvc.perform(put("/building/room/{id}/","1").contentType(MediaType.APPLICATION_JSON).
				content("{\"name\":\"Costanzza\",\"type\":\"Virtual\", \"occupation\": \"full\", \"capacity\": 3}, \"floorNumber\": 4, \"amenities\": []}"))
				.andExpect(status().isOk());
	}
	public void addRoomBad() throws Exception{
		mockMvc.perform(put("/building/room/{id}/", "0").contentType(MediaType.APPLICATION_JSON).
				content("{\"name\":\"Costanzza\",\"type\":\"Virtual\", \"occupation\": \"full\", \"capacity\": 3}, \"floorNumber\": 4, \"amenities\": []}"))
				.andExpect(status().isBadRequest());
	}
	public void deleteRoom() throws Exception{
		mockMvc.perform(delete("/building/room/{buildingId}/{roomId}","1","0").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
	}
	public void deleteRoomBad() throws Exception{
		mockMvc.perform(put("/building/room/{buildingId}/{roomId}", "0","0").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isBadRequest());
	}
	
	public void updateBuilding() throws Exception{
		mockMvc.perform(put("/building/{id}","1").contentType(MediaType.APPLICATION_JSON).
				content("{\"city\":\"Miami\",\"street_address\":\"Main Street\", \"zipCode\": \"1234\", \"totalFloors\": 3}"))
				.andExpect(status().isCreated());
	}
	public void updateBuildingBad() throws Exception{
		mockMvc.perform(patch("/building/{id}","0").contentType(MediaType.APPLICATION_JSON).
				content("{\"city\":\"Miami\",\"street_address\":\"Main Street\", \"zipCode\": \"1234\", \"totalFloors\": 3}"))
				.andExpect(status().isBadRequest());
	}
}
