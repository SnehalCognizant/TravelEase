package com.cts.backend.propertyandroominventorymanagement.dtos.request;

import com.cts.backend.propertyandroominventorymanagement.entities.Status;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PropertyRequest {

    @NotBlank
    private String name;

    private String location;

    @Min(0) @Max(5)
    private Double rating;

    private Status status;
}