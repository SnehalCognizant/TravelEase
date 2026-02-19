package com.cts.backend.propertyandroominventorymanagement.dtos.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class RoomTypeRequest {
    @NotNull
    private Long propertyId;
    @NotBlank
    private String name;
    @Min(1)
    private Integer capacity;
    @Positive
    private Double baseRate;
}
