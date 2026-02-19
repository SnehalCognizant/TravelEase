package com.cts.backend.propertyandroominventorymanagement.dtos.response;

import com.cts.backend.propertyandroominventorymanagement.entities.Status;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PropertyResponse {
    private Long propertyId;
    private String name;
    private String location;
    private Double rating;
    private Status status;
}
