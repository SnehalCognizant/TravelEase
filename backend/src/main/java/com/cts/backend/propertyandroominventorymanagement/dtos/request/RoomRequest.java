package com.cts.backend.propertyandroominventorymanagement.dtos.request;

import com.cts.backend.propertyandroominventorymanagement.entities.RoomStatus;
import com.cts.backend.propertyandroominventorymanagement.entities.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RoomRequest {
    @NotNull
    private Long roomTypeId;
    @NotBlank
    private String roomNumber;
    private Integer floor;
    private RoomStatus status;
}
