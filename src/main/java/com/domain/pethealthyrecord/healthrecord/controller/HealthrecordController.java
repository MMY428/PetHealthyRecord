package com.domain.pethealthyrecord.healthrecord.controller;

import com.domain.pethealthyrecord.healthrecord.dto.HealthrecordCreateRequest;
import com.domain.pethealthyrecord.healthrecord.dto.HealthrecordResponse;
import com.domain.pethealthyrecord.healthrecord.dto.HealthrecordUpdateRequest;
import com.domain.pethealthyrecord.healthrecord.service.HealthrecordService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pets/{petId}/healthy-records")
@RequiredArgsConstructor
public class HealthrecordController {

    private final HealthrecordService healthrecordService;

    @PostMapping
    public ResponseEntity<Void> createHealthrecord(@PathVariable Long petId,
                                                   @Valid @RequestBody HealthrecordCreateRequest request) {
        healthrecordService.createHealthrecord(petId, request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public List<HealthrecordResponse> getHealthrecords() { return healthrecordService.getHealthrecords(); }

    @GetMapping("/{HealthrecordId}")
    public HealthrecordResponse getHealthrecord(@PathVariable Long HealthrecordId) { return healthrecordService.getHealthrecord(HealthrecordId); }

    @PutMapping("/{HealthrecordId}")
    public ResponseEntity<Void> updateHealthrecord(@PathVariable Long HealthrecordId,
                                                   @Valid @RequestBody HealthrecordUpdateRequest request){
        healthrecordService.updateHealthrecord(healthrecordId, request);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{HealthrecordId}")
    public ResponseEntity<Void> deleteHealthrecord(@PathVariable Long HealthrecordId){
        healthrecordService.deleteHealthrecord(healthrecordId);
        return ResponseEntity.noContent().build();
    }
}
