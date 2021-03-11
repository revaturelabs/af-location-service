package com.revature.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.revature.dto.RoomRequestDto;
import com.revature.model.Room;
import com.revature.service.RoomService;
import com.revature.statics.RoomOccupation;
import com.revature.statics.RoomType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(RoomController.class)
public class RoomControllerTests {

    @Autowired
    MockMvc mockMvc;


    @MockBean
    private RoomService roomService;

    private final ObjectMapper mapper = Jackson2ObjectMapperBuilder.json().build();

    private final ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter ();

    private static  RoomRequestDto unsavedRoom1 = new RoomRequestDto();

    private Room physicalMeetingRoom1;
    private Room physicalMeetingRoom1WithId;


    @Before
    public void setUp() throws Exception{



    }

    @Test
    public void whenProvidingProperRoomModel_RoomIsCreatedReturningWithCode201() throws Exception{
        //This will have to be re-worked to account for building having to be set for Room Model
        // RoomRequestDto will need to provide building id so service can bind building to room
        //Afraid to add buildingIdToRoomRequestDto just in case it breaks others' tests.
    }

    @Test
    public void whenProvidingBadRoomModel_BadRequestIsReturnedWithCode400() throws Exception{
        //This will have to be re-worked to account for building having to be set for Room Model
        // RoomRequestDto will need to provide building id so service can bind building to room
        //Afraid to add buildingIdToRoomRequestDto just in case it breaks others' tests.
    }

    @Test
    public void whenGettingRoomWithValidId_RequestedRoomDetailsDtoIsReturnedWithCode200() {


    }

    @Test
    public void whenGettingRoomWithInvalidId_404IsReturned(){

    }


    @Test
    public void whenGettingPhysicalMeetingRooms_AllPhysicalMeetingRoomsAreReturnedWithCode200(){

    }

    @Test
    public void whenGettingPhysicalTrainingRooms_AllPhysicalTrainingRoomsAreReturnedWithCode200(){

    }

    @Test
    public void whenGettingRemoteRooms_AllRemoteRoomsAreReturnedWithCode200(){

    }

    @Test
    public void whenGettingPhysicalRooms_AllPhysicalRoomsAreReturnedWithCode200(){

    }

    @Test
    public void whenGettingMeetingRooms_AllPhysicalRoomsAreReturnedWithCode200(){

    }


    @Test
    public void whenGettingAllRooms_AllRoomsAreReturnedWithCode200(){

    }

    @Test
    public void whenGettingRemoteTrainingRooms_AllRemoteTrainingRoomsAreReturnedWithCode200(){

    }

    @Test
    public void whenGettingRemoteMeetingRooms_AllRemoteMeetingRoomsAreReturnedWithCode200(){

    }

    @Test
    public void whenSavingANewRoom_NewRoomIsSavedAndResponseIsReturnedWithCode201(){

    }

    @Test
    public void whenSavingABadRoom_ExceptionIsThrownAndResponseIsReturnedWithCode400(){

    }

    @Test
    public void whenGettingRoomsByBuildingId_RoomsForThatBuildingAreReturnedWithCode200(){

    }


    @Test
    public void whenDeletingRoomWithValidId_RoomIsDeletedCode204IsReturned(){

    }

    @Test
    public void whenDeletingRoomWithInvalidId_NotFoundErrorIsThrownAndCode400IsReturned(){

    }

    @Test
    public void whenUpdatingRoomWithValidId_RoomIsUpdatedAndCode204IsReturned(){

    }










}
