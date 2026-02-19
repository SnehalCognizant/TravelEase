package com.cts.backend.propertyandroominventorymanagement.service.interfaces;




import com.cts.backend.propertyandroominventorymanagement.dtos.request.RoomTypeRequest;
import com.cts.backend.propertyandroominventorymanagement.dtos.response.RoomTypeResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RoomTypeService {

    RoomTypeResponse create(RoomTypeRequest request);

    RoomTypeResponse get(Long id);

    Page<RoomTypeResponse> getAll(Pageable pageable);

    RoomTypeResponse update(Long id, RoomTypeRequest request);

    void delete(Long id);
}
