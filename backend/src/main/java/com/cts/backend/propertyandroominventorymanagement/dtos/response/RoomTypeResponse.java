package com.cts.backend.propertyandroominventorymanagement.dtos.response;

import lombok.*;

import java.util.Set;

@Getter @Setter
@Builder
public class RoomTypeResponse {
    private Long roomTypeId;
    private Long propertyId;
    private String name;
    private Integer capacity;
    private Double baseRate;
    private Set<String> amenities;

}
