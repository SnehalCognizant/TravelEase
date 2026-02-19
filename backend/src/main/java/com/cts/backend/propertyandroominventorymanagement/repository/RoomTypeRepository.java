package com.cts.backend.propertyandroominventorymanagement.repository;

import com.cts.backend.propertyandroominventorymanagement.entities.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomTypeRepository extends JpaRepository<RoomType, Long> {}
