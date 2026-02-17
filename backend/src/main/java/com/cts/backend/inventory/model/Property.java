package com.cts.backend.inventory.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "property")
@Getter @Setter
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long propertyId;

    @Column(nullable = false, length = 150)
    private String name;

    private String location;

    @Column(length = 20)
    private String status; // Active/Inactive
}
