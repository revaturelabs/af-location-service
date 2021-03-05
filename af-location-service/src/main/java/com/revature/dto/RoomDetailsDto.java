package com.revature.dto;


import lombok.Data;

import java.util.Set;

@Data
public class RoomDetailsDto {

    int id;
    String name;
    String type;
    String occupation;
    int capacity;
    int floorNumber;
    Set<String> amenities;


}
