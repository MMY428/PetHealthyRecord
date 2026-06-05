package com.domain.pethealthyrecord.pet.controller;

import com.domain.pethealthyrecord.pet.dto.PetCreateRequest;
import com.domain.pethealthyrecord.pet.dto.PetResponse;
import com.domain.pethealthyrecord.pet.dto.PetUpdateRequest;
import com.domain.pethealthyrecord.pet.service.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pets")
@RequiredArgsConstructor
public class PetController {

    private final PetService petService;

    @PostMapping
    public String createPet(@RequestBody PetCreateRequest request){
        petService.createPet(request);
        return "반려동물 등록 완료";
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
    public String updatePet(@PathVariable Long petId,
                            @RequestBody PetUpdateRequest request){
        petService.updatePet(petId, request);
        return "반려동물 수정 완료";
    }

    @DeleteMapping("/{petId}")
    public String deletePet(@PathVariable Long petId){
        petService.deletePet(petId);
        return "반려동물 삭제 완료";
    }
}
