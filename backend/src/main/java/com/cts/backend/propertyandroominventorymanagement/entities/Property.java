package com.cts.backend.propertyandroominventorymanagement.entities;

import com.cts.backend.propertyandroominventorymanagement.entities.Status;
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
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long propertyId;

    @Column(nullable=false)
    private String name;

    private String location;
    private Double rating;

    @Enumerated(EnumType.STRING)
    private Status status;
}