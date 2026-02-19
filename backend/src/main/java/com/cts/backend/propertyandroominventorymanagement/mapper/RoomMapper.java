package com.cts.backend.propertyandroominventorymanagement.mapper;

import com.cts.backend.propertyandroominventorymanagement.dtos.request.RoomRequest;
import com.cts.backend.propertyandroominventorymanagement.dtos.response.RoomResponse;
import com.cts.backend.propertyandroominventorymanagement.entities.Room;
import org.springframework.stereotype.Component;

@Component
public class RoomMapper {

    public Room toEntity(RoomRequest r){
        return Room.builder()
                .roomTypeId(r.getRoomTypeId())
                .roomNumber(r.getRoomNumber())
                .floor(r.getFloor())
                .status(r.getStatus())
                .build();
    }

    public RoomResponse toResponse(Room r){
        return RoomResponse.builder()
                .roomId(r.getRoomId())
                .roomTypeId(r.getRoomTypeId())
                .roomNumber(r.getRoomNumber())
                .floor(r.getFloor())
                .status(r.getStatus())
                .build();
    }
}