package com.revature.dto;

import com.revature.statics.RoomType;
import lombok.Data;

import java.util.Set;

@Data
public class RoomRequestDto {

    private String name;
    private String type;
    private String occupation;
    private int capacity;
    private int floorNumber;
    private Set<String> amenities;
}
