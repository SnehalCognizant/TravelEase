package com.cts.backend.propertyandroominventorymanagement.service.impl;

import com.cts.backend.propertyandroominventorymanagement.dtos.request.PropertyRequest;
import com.cts.backend.propertyandroominventorymanagement.dtos.response.PropertyResponse;
import com.cts.backend.propertyandroominventorymanagement.entities.Property;
import com.cts.backend.propertyandroominventorymanagement.exception.ResourceNotFound;
import com.cts.backend.propertyandroominventorymanagement.mapper.PropertyMapper;
import com.cts.backend.propertyandroominventorymanagement.repository.PropertyRepository;
import com.cts.backend.propertyandroominventorymanagement.service.interfaces.PropertyService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PropertyServiceImpl implements PropertyService {

    private final PropertyRepository repo;
    private final PropertyMapper mapper;

    public PropertyResponse create(PropertyRequest req){
        return mapper.toResponse(repo.save(mapper.toEntity(req)));
    }

    public PropertyResponse get(Long id){
        Property p = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFound("Property not found"));
        return mapper.toResponse(p);
    }

    public Page<PropertyResponse> getAll(Pageable pageable){
        return repo.findAll(pageable).map(mapper::toResponse);
    }

    public PropertyResponse update(Long id, PropertyRequest req){
        Property p = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFound("Property not found"));

        p.setName(req.getName());
        p.setLocation(req.getLocation());
        p.setRating(req.getRating());
        p.setStatus(req.getStatus());

        return mapper.toResponse(repo.save(p));
    }

    public void delete(Long id){
        repo.deleteById(id);
    }
}