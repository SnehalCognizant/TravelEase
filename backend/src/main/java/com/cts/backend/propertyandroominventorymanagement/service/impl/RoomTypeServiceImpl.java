package com.cts.backend.propertyandroominventorymanagement.service.impl;

import com.cts.backend.propertyandroominventorymanagement.dtos.request.RoomTypeRequest;
import com.cts.backend.propertyandroominventorymanagement.dtos.response.RoomTypeResponse;
import com.cts.backend.propertyandroominventorymanagement.entities.RoomType;
import com.cts.backend.propertyandroominventorymanagement.exception.ResourceNotFound;
import com.cts.backend.propertyandroominventorymanagement.mapper.RoomTypeMapper;
import com.cts.backend.propertyandroominventorymanagement.repository.RoomTypeRepository;
import com.cts.backend.propertyandroominventorymanagement.service.interfaces.RoomTypeService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class RoomTypeServiceImpl implements RoomTypeService {
    @Autowired
    private RoomTypeRepository repository;
    @Autowired
    private final RoomTypeMapper mapper;

    @Override
    public RoomTypeResponse create(RoomTypeRequest request) {
        RoomType entity = mapper.toEntity(request);
        return mapper.toResponse(repository.save(entity));
    }

    @Override
    public RoomTypeResponse get(Long id) {
        RoomType entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFound("RoomType not found with id: " + id));

        return mapper.toResponse(entity);
    }

    @Override
    public Page<RoomTypeResponse> getAll(Pageable pageable) {
        return repository.findAll(pageable)
                .map(mapper::toResponse);
    }

    @Override
    public RoomTypeResponse update(Long id, RoomTypeRequest request) {

        RoomType entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFound("RoomType not found with id: " + id));

        entity.setPropertyId(request.getPropertyId());
        entity.setName(request.getName());
        entity.setCapacity(request.getCapacity());
        entity.setBaseRate(request.getBaseRate());

        return mapper.toResponse(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        if (!repository.existsById(id))
            throw new ResourceNotFound("RoomType not found with id: " + id);

        repository.deleteById(id);
    }
}
