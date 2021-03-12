package com.revature.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.revature.Exception.NotFoundException;
import com.revature.dto.RoomDetailsDto;
import com.revature.dto.RoomRequestDto;
import com.revature.model.Building;
import com.revature.model.Location;
import com.revature.model.Room;
import com.revature.repository.BuildingRepository;
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
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(RoomController.class)
public class RoomControllerTests {


    @Autowired
    MockMvc mockMvc;
    @MockBean
    private RoomService roomService;

    @MockBean
    private BuildingRepository buildingRepository;

    private Room physicalMeetingRoom1;

    private Location testLocation1;
    private Building testBuilding1;

    private static RoomRequestDto unsavedRoom1 = new RoomRequestDto ();
    private final ObjectMapper mapper = Jackson2ObjectMapperBuilder.json ().build ();
    private final ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter ();

    private static RoomDetailsDto roomDetailsMapper( Room room ) {
        RoomDetailsDto detailsDto = new RoomDetailsDto ();
        detailsDto.setId(room.getRoomId ());
        detailsDto.setOccupation ( room.getOccupation().name () );
        detailsDto.setCapacity ( room.getCapacity () );
        detailsDto.setFloorNumber ( room.getFloorNumber () );
        detailsDto.setName ( room.getName () );
        detailsDto.setType ( room.getType ().toString () );
        Set<String> roomAmenities = room.getRoomAmenities ();
        detailsDto.setAmenities ( roomAmenities );
        return detailsDto;
    }

    private static RoomRequestDto roomRequestMapper(Room room){
        RoomRequestDto requestDto = new RoomRequestDto();
        requestDto.setName(room.getName());
        requestDto.setCapacity(room.getCapacity());
        requestDto.setFloorNumber(room.getFloorNumber());
        requestDto.setOccupation ( room.getOccupation().name() );
        requestDto.setType ( room.getType().name());
        requestDto.setAmenities(room.getRoomAmenities());

        return requestDto;
    }


    @Before
    public void setUp() throws Exception {

        testLocation1 = new Location ();
        testLocation1.setLocationId ( 1 );
        testLocation1.setCity ( "Test City" );
        testLocation1.setState ( "Test State" );

        testBuilding1 = new Building ();
        testBuilding1.setCity ( "Test City" );
        testBuilding1.setLocation ( testLocation1 );
        testBuilding1.setBuildingId ( 1 );

        Set<String> amenities = new HashSet<> ( 2 );
        amenities.addAll ( Collections.singletonList ( "AIR CONDITIONING" ) );
        physicalMeetingRoom1 = new Room ();
        physicalMeetingRoom1.setRoomId ( 1 );
        physicalMeetingRoom1.setBuilding ( testBuilding1 );
        physicalMeetingRoom1.setCapacity ( 20 );
        physicalMeetingRoom1.setName ( "PHYSICAL MEETING 1" );
        physicalMeetingRoom1.setOccupation ( RoomOccupation.MEETING );
        physicalMeetingRoom1.setRoomAmenities ( amenities );
        physicalMeetingRoom1.setFloorNumber ( 1 );
        physicalMeetingRoom1.setType ( RoomType.PHYSICAL );

        Room physicalMeetingRoom1NoId = new Room();
        physicalMeetingRoom1NoId.setBuilding ( testBuilding1 );
        physicalMeetingRoom1NoId.setCapacity ( 20 );
        physicalMeetingRoom1NoId.setName ( "PHYSICAL MEETING 1" );
        physicalMeetingRoom1NoId.setOccupation ( RoomOccupation.MEETING );
        physicalMeetingRoom1NoId.setRoomAmenities ( amenities );
        physicalMeetingRoom1NoId.setFloorNumber ( 1 );
        physicalMeetingRoom1NoId.setType ( RoomType.PHYSICAL );

        when ( roomService.getRoom ( 1 )).thenReturn ( roomDetailsMapper ( physicalMeetingRoom1 ));
        when ( roomService.getRoom(500)).thenThrow( new NotFoundException ("Room with id " + 500 + " not found."));
        when ( buildingRepository.existsById ( 1 )).thenReturn(true);
        when ( buildingRepository.existsById ( 500 )).thenReturn(false);
        when ( buildingRepository.getOne ( 1 )).thenReturn(testBuilding1);


        when (roomService.saveRoom ( physicalMeetingRoom1NoId )).thenReturn(roomDetailsMapper ( physicalMeetingRoom1 ));

    }

    @Test
    public void whenProvidingProperRoomModel_RoomIsCreatedReturningWithCode201() throws Exception {

        //Will get buildling id from path variable.
    }

    @Test
    public void whenProvidingBadRoomModel_BadRequestIsReturnedWithCode400() throws Exception {


        //Will get buildling id from path variable.

    }

    @Test
    public void whenGettingRoomWithValidId_RequestedRoomDetailsDtoIsReturnedWithCode200() throws Exception {



        RequestBuilder request = MockMvcRequestBuilders.get ( "/api/room/1" );
        MvcResult result = mockMvc.perform ( request ).andExpect ( status ().isOk () ).andReturn ();

        String mappedResult = result.getResponse ().getContentAsString ();

        RoomDetailsDto resultDto = mapper.readValue ( mappedResult, RoomDetailsDto.class );

        assertEquals ( roomDetailsMapper ( physicalMeetingRoom1 ), resultDto );

    }

    @Test
    public void whenGettingRoomWithInvalidId_404IsReturned() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get ( "/api/room/500" );
        MvcResult result = mockMvc.perform ( request ).andExpect ( status ().isNotFound () ).andReturn ();
        assertEquals ( 404, result.getResponse ().getStatus () );

    }


    @Test
    public void whenGettingPhysicalMeetingRooms_AllPhysicalMeetingRoomsAreReturnedWithCode200() {

    }

    @Test
    public void whenGettingPhysicalTrainingRooms_AllPhysicalTrainingRoomsAreReturnedWithCode200() {

    }

    @Test
    public void whenGettingRemoteRooms_AllRemoteRoomsAreReturnedWithCode200() {

    }

    @Test
    public void whenGettingPhysicalRooms_AllPhysicalRoomsAreReturnedWithCode200() {

    }

    @Test
    public void whenGettingMeetingRooms_AllPhysicalRoomsAreReturnedWithCode200() {

    }


    @Test
    public void whenGettingAllRooms_AllRoomsAreReturnedWithCode200() {

    }

    @Test
    public void whenGettingRemoteTrainingRooms_AllRemoteTrainingRoomsAreReturnedWithCode200() {

    }

    @Test
    public void whenGettingRemoteMeetingRooms_AllRemoteMeetingRoomsAreReturnedWithCode200() {

    }

    @Test
    public void whenSavingANewRoom_NewRoomIsSavedAndResponseIsReturnedWithCode201() throws Exception {


        String mappedRequestObject = writer.writeValueAsString(roomRequestMapper ( physicalMeetingRoom1 ));

        RequestBuilder request = MockMvcRequestBuilders.post("/api/location/building/1/room")
                .contentType(APPLICATION_JSON)
                .content(mappedRequestObject)
                .characterEncoding ( "utf-8" );

        MvcResult result = mockMvc.perform(request).andExpect(status().isCreated()).andReturn();

        String mappedResult = result.getResponse().getContentAsString ();

        RoomDetailsDto resultObject = mapper.readValue ( mappedResult, RoomDetailsDto.class );

        assertEquals(roomDetailsMapper ( physicalMeetingRoom1 ), resultObject);



    }

    @Test
    public void whenSavingABadRoom_ExceptionIsThrownAndResponseIsReturnedWithCode400() {

    }

    @Test
    public void whenGettingRoomsByBuildingId_RoomsForThatBuildingAreReturnedWithCode200() {

    }


    @Test
    public void whenDeletingRoomWithValidId_RoomIsDeletedCode204IsReturned() {

    }

    @Test
    public void whenDeletingRoomWithInvalidId_NotFoundErrorIsThrownAndCode404IsReturned() {

    }

    @Test
    public void whenUpdatingRoomWithValidId_RoomIsUpdatedAndCode204IsReturned() {

    }


}
