package com.revature.dto;

import com.revature.statics.RoomType;

import java.util.Set;

public class RoomRequestDto {

    public String name;
    public String type;
    public String occupation;
    public int capacity;
    public int floorNumber;
    public Set<String> amenities;
}
