package com.domain.pethealthyrecord.pet.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pets")
public class PetController {

    private final PetService petService;

    public PetController(PetService perService){
        this.petService = perService;
    }

    @PostMapping
    public String createPet(@RequestBody petCreateRequest request){
        petService.createPet(request);
        return "반려동물 등록 완료";
    }

    @GetMapping
    public List<petResponse> getPets(){
        return petService.getPets();
    }

    @GetMapping("/{petId}")
    public petResponse getPet(@PathVariable Long petId) {
        return petService.getPet();
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
