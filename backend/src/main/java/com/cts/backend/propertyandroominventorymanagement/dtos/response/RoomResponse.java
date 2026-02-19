package com.cts.backend.propertyandroominventorymanagement.dtos.response;

import com.cts.backend.propertyandroominventorymanagement.entities.RoomStatus;
import com.cts.backend.propertyandroominventorymanagement.entities.Status;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoomResponse {
    private Long roomId;
    private Long roomTypeId;
    private String roomNumber;
    private Integer floor;
    private RoomStatus status;
}
