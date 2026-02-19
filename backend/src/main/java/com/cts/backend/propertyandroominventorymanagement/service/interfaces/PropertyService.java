package com.cts.backend.propertyandroominventorymanagement.service.interfaces;



import com.cts.backend.propertyandroominventorymanagement.dtos.request.PropertyRequest;
import com.cts.backend.propertyandroominventorymanagement.dtos.response.PropertyResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PropertyService {
    PropertyResponse create(PropertyRequest request);
    PropertyResponse get(Long id);
    Page<PropertyResponse> getAll(Pageable pageable);
    PropertyResponse update(Long id, PropertyRequest request);
    void delete(Long id);
}
