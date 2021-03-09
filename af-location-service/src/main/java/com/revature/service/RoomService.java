package com.revature.service;

import com.revature.dto.RoomDetailsDto;
import com.revature.dto.RoomDto;
import com.revature.dto.RoomRequestDto;

import java.util.List;
public interface RoomService {


    RoomDetailsDto getRoom( int id );

    List<RoomDto> getPhysicalMeetingRooms();


    List<RoomDto> getPhysicalTrainingRooms();

    List<RoomDto> getRemoteRooms();

    List<RoomDto> getPhysicalRooms();

    List<RoomDto> getVirtualRooms();

    List<RoomDto> getMeetingRooms();

    List<RoomDto> getTrainingRooms();

    List<RoomDto> getAllRooms();

    List<RoomDto> getRemoteTrainingRooms();

    List<RoomDto> getRemoteMeetingRooms();

    void updateName(int id, String name);

    void updateRoomType(int id, String type );

    void updateCapacity(int id, int capacity);

    void removeAmenity(int id, String amenity);

    void addAmenity(int id, String amenity);

    void deleteRoom(int id);

    void updateRoom( int id, RoomRequestDto roomRequestDto );


}
