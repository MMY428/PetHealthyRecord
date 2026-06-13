package com.domain.pethealthyrecord.pet.controller;

import com.domain.pethealthyrecord.pet.dto.PetCreateRequest;
import com.domain.pethealthyrecord.pet.dto.PetResponse;
import com.domain.pethealthyrecord.pet.dto.PetUpdateRequest;
import com.domain.pethealthyrecord.pet.service.PetService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pets")
@RequiredArgsConstructor
public class PetController {

    private final PetService petService;

    @PostMapping
    public ResponseEntity<Void> createPet(@Valid @RequestBody PetCreateRequest request){
        petService.createPet(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public List<PetResponse> getPets(){
        return petService.getPets();
    }

    @GetMapping("/{petId}")
    public PetResponse getPet(@PathVariable Long petId) {
        return petService.getPet(petId);
    }

    @PutMapping("/{petId}")
    public ResponseEntity<Void> updatePet(@PathVariable Long petId,
                                          @Valid @RequestBody PetUpdateRequest request){
        petService.updatePet(petId, request);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{petId}")
    public ResponseEntity<Void> deletePet(@PathVariable Long petId){
        petService.deletePet(petId);
        return ResponseEntity.noContent().build();
    }
}
