package com.revature.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
	public void getAllBuildings() throws Exception {

		mockMvc.perform(get("/buildings")
				.contentType(MediaType.APPLICATION_JSON).content("{}"))
				.andExpect(status().isOk());

	}

	@Test
	public void getAllBuildingsNotFound() throws Exception{

		mockMvc.perform(get("/building/")
				.contentType(MediaType.APPLICATION_JSON).content("{}"))
				.andExpect(status().isNotFound());

	}

	@Test 
	public void getBuildingsByCity() throws Exception {

		mockMvc.perform(get("/buildings/city/{city}/","Miami")
				.contentType(MediaType.APPLICATION_JSON).content("{}"))
				.andExpect(status().isOk());

	}

	@Test
	public void getBuildingsByCityBadRequest() throws Exception {

		mockMvc.perform(get("/buildings/city/{city}/", "")
				.contentType(MediaType.APPLICATION_JSON).content("{}"))
				.andExpect(status().isBadRequest());

	}

	@Test
	public void getBuildingsByAddress() throws Exception {

		mockMvc.perform(get("/buildings/street/{address}/", "Main%20Street")
				.contentType(MediaType.APPLICATION_JSON).content("{}"))
				.andExpect(status().isOk());

	}

	@Test
	public void getBuildingsByAddressBadRequest() throws Exception {

		mockMvc.perform(get("/buildings/street/{address}/", "")
				.contentType(MediaType.APPLICATION_JSON).content("{}"))
				.andExpect(status().isBadRequest());

	}

	@Test
	public void getBuildingsById() throws Exception {

		mockMvc.perform(get("/buildings/{id}/", "1")
				.contentType(MediaType.APPLICATION_JSON).content("{}"))
				.andExpect(status().isOk());

	}

	@Test
	public void getBuildingsByIdBadRequest() throws Exception {

		mockMvc.perform(get("/buildings/{id}/", "j")
				.contentType(MediaType.APPLICATION_JSON).content("{}"))
				.andExpect(status().isBadRequest());

	}

	@Test
	public void updateBuildingCity() throws Exception {

		mockMvc.perform(patch("/buildings/{id}/city/{city}/", "1","plano")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());

	}

	@Test
	public void updateBuildingCityNotAllowed() throws Exception {

		mockMvc.perform(patch("/buildings/{id}/city/{cityName}/","","Plano")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isMethodNotAllowed());

	}

	@Test
	public void updateBuildingZipCode() throws Exception {

		mockMvc.perform(patch("/buildings/{id}/zipCode/{zip}/", "1", "33177")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());

	}

	@Test
	public void updateBuildingZipCodeBadRequest() throws Exception {

		mockMvc.perform(patch("/buildings/{id}/zipCode/{zip}/", "j","33177")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isBadRequest());

	}

	@Test
	public void updateNumberOfFloors() throws Exception {

		mockMvc.perform(patch("/buildings/{id}/floors/{count}", "1","2")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());

	}

	@Test
	public void updateNumberOfFloorsIsBadRequest() throws Exception {

		mockMvc.perform(patch("/buildings/{id}/floors/{count}", "j","2")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isBadRequest());

	}

	@Test
	public void addRoom() throws Exception{

		mockMvc.perform(patch("/buildings/{id}/room/","1").contentType(MediaType.APPLICATION_JSON).
				content("{\"name\":\"Costanzza\",\"type\":\"Virtual\", \"occupation\": " +
						"\"full\", \"capacity\": 3}, \"floorNumber\": 4, \"amenities\": []}"))
				.andExpect(status().isOk());

	}

	@Test
	public void addRoomBad() throws Exception{

		mockMvc.perform(patch("/buildings/{id}/room/", "u").contentType(MediaType.APPLICATION_JSON).
				content("{\"name\":\"Costanzza\",\"type\":\"Virtual\", \"occupation\":" +
						" \"full\", \"capacity\": 3}, \"floorNumber\": 4, \"amenities\": []}"))
				.andExpect(status().isBadRequest());

	}

	@Test
	public void deleteRoom() throws Exception{

		mockMvc.perform(delete("/buildings/{buildingId}/room/{roomId}","1","0")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());

	}

	@Test
	public void deleteRoomBad() throws Exception{

		mockMvc.perform(delete("/buildings/{buildingId}/room/{roomId}", "0","j")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isBadRequest());

	}

	@Test
	public void updateBuilding() throws Exception{

		mockMvc.perform(patch("/buildings/{id}","1").contentType(MediaType.APPLICATION_JSON).
				content("{\"city\":\"Miami\",\"street_address\":\"Main Street\", " +
						"\"zipCode\": \"1234\", \"totalFloors\": 3}"))
				.andExpect(status().isOk());

	}

	@Test
	public void updateBuildingBad() throws Exception{

		mockMvc.perform(patch("/buildings/{id}","l").contentType(MediaType.APPLICATION_JSON).
				content("{\"city\":\"Miami\",\"street_address\":\"Main Street\"," +
						" \"zipCode\": \"1234\", \"totalFloors\": 3}"))
				.andExpect(status().isBadRequest());

	}

}
