package com.cts.backend.propertyandroominventorymanagement.mapper;

import com.cts.backend.propertyandroominventorymanagement.dtos.request.RoomTypeRequest;
import com.cts.backend.propertyandroominventorymanagement.dtos.response.RoomTypeResponse;
import com.cts.backend.propertyandroominventorymanagement.entities.RoomType;
import org.springframework.stereotype.Component;

@Component
public class RoomTypeMapper {

    public RoomType toEntity(RoomTypeRequest r){
        return RoomType.builder()
                .propertyId(r.getPropertyId())
                .name(r.getName())
                .capacity(r.getCapacity())
                .baseRate(r.getBaseRate())
                .build();
    }

    public RoomTypeResponse toResponse(RoomType r){
        return RoomTypeResponse.builder()
                .roomTypeId(r.getRoomTypeId())
                .propertyId(r.getPropertyId())
                .name(r.getName())
                .capacity(r.getCapacity())
                .baseRate(r.getBaseRate())
                .build();
    }
}
