package com.revature.service;

import com.revature.dto.RoomDto;

import java.util.List;
public interface RoomService {


    RoomDto getRoom( int i );

    List<RoomDto> getPhysicalMeetingRooms();


    List<RoomDto> getPhysicalTrainingRooms();

    List<RoomDto> getRemoteRooms();

    List<RoomDto> getPhysicalRooms();

    List<RoomDto> getVirtualRooms();

    List<RoomDto> getMeetingRooms();

    List<RoomDto> getTrainingRooms();

    List<RoomDto> getAllRooms();
}
