package com.cts.backend.propertyandroominventorymanagement.entities;

import com.cts.backend.propertyandroominventorymanagement.entities.RoomStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;

    private Long roomTypeId;
    private String roomNumber;
    private Integer floor;

    @Enumerated(EnumType.STRING)
    private RoomStatus status;
}