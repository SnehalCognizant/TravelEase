package com.cts.backend.propertyandroominventorymanagement.mapper;

import com.cts.backend.propertyandroominventorymanagement.dtos.request.PropertyRequest;
import com.cts.backend.propertyandroominventorymanagement.dtos.response.PropertyResponse;
import com.cts.backend.propertyandroominventorymanagement.entities.Property;
import org.springframework.stereotype.Component;

@Component
public class PropertyMapper {
    public Property toEntity(PropertyRequest r){
        return Property.builder()
                .name(r.getName())
                .location(r.getLocation())
                .rating(r.getRating())
                .status(r.getStatus())
                .build();
    }

    public PropertyResponse toResponse(Property p){
        return PropertyResponse.builder()
                .propertyId(p.getPropertyId())
                .name(p.getName())
                .location(p.getLocation())
                .rating(p.getRating())
                .status(p.getStatus())
                .build();
    }
}