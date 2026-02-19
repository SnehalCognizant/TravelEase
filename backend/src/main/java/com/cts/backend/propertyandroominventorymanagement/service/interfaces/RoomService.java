package com.cts.backend.propertyandroominventorymanagement.service.interfaces;


import com.cts.backend.propertyandroominventorymanagement.dtos.request.RoomRequest;
import com.cts.backend.propertyandroominventorymanagement.dtos.response.RoomResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RoomService {

    RoomResponse create(RoomRequest request);

    RoomResponse get(Long id);

    Page<RoomResponse> getAll(Pageable pageable);

    RoomResponse update(Long id, RoomRequest request);

    void delete(Long id);
}
