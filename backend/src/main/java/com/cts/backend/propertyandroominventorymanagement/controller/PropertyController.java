package com.cts.backend.propertyandroominventorymanagement.controller;

import com.cts.backend.propertyandroominventorymanagement.dtos.request.PropertyRequest;
import com.cts.backend.propertyandroominventorymanagement.service.interfaces.PropertyService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/properties")
@RequiredArgsConstructor
public class PropertyController {

    private final PropertyService service;

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody PropertyRequest r){
        return ResponseEntity.ok(service.create(r));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable Long id){
        return ResponseEntity.ok(service.get(id));
    }

    @GetMapping
    public ResponseEntity<?> all(Pageable pageable){
        return ResponseEntity.ok(service.getAll(pageable));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,
                                    @Valid @RequestBody PropertyRequest r){
        return ResponseEntity.ok(service.update(id,r));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.ok("Deleted");
    }
}