package com.cts.backend.propertyandroominventorymanagement.service.impl;

import com.cts.backend.propertyandroominventorymanagement.dtos.request.RoomRequest;
import com.cts.backend.propertyandroominventorymanagement.dtos.response.RoomResponse;
import com.cts.backend.propertyandroominventorymanagement.entities.Room;
import com.cts.backend.propertyandroominventorymanagement.exception.ResourceNotFound;
import com.cts.backend.propertyandroominventorymanagement.mapper.RoomMapper;
import com.cts.backend.propertyandroominventorymanagement.repository.RoomRepository;
import com.cts.backend.propertyandroominventorymanagement.service.interfaces.RoomService;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService {

    private final RoomRepository repository;
    private final RoomMapper mapper;

    @Override
    public RoomResponse create(RoomRequest request) {
        Room entity = mapper.toEntity(request);
        return mapper.toResponse(repository.save(entity));
    }

    @Override
    public RoomResponse get(Long id) {
        Room entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFound("Room not found with id: " + id));

        return mapper.toResponse(entity);
    }

    @Override
    public Page<RoomResponse> getAll(Pageable pageable) {
        return repository.findAll(pageable)
                .map(mapper::toResponse);
    }

    @Override
    public RoomResponse update(Long id, RoomRequest request) {

        Room entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFound("Room not found with id: " + id));

        entity.setRoomTypeId(request.getRoomTypeId());
        entity.setRoomNumber(request.getRoomNumber());
        entity.setFloor(request.getFloor());
        entity.setStatus(request.getStatus());

        return mapper.toResponse(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        if (!repository.existsById(id))
            throw new ResourceNotFound("Room not found with id: " + id);

        repository.deleteById(id);
    }
}
