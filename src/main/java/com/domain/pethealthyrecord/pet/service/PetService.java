package com.domain.pethealthyrecord.pet.service;

import com.domain.pethealthyrecord.pet.dto.PetCreateRequest;
import com.domain.pethealthyrecord.pet.dto.PetResponse;
import com.domain.pethealthyrecord.pet.dto.PetUpdateRequest;
import com.domain.pethealthyrecord.pet.entity.PetEntity;
import com.domain.pethealthyrecord.pet.repository.PetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PetService {

    private final PetRepository petRepository;

    //createPet
    public void createPet(PetCreateRequest request) {
        PetEntity pet = PetEntity.builder()
                .name(request.getName())
                .species(request.getSpecies())
                .breed(request.getBreed())
                .birthDate(request.getBirthDate())
                .imageUrl(request.getImageUrl())
                .build();
        petRepository.save(pet);
    }

    //getPets
    public List<PetResponse> getPets() {
        List<PetEntity> pets = petRepository.findAll();
        return pets.stream()
                .map(pet -> new PetResponse(
                        pet.getId(),
                        pet.getName(),
                        pet.getSpecies(),
                        pet.getBreed(),
                        pet.getBirthDate(),
                        pet.getImageUrl()
                ))
                .toList();
    }
    //getPet
    public PetResponse getPet(Long petId) {
        PetEntity pet = petRepository.findById(petId)
                .orElseThrow(()-> new IllegalArgumentException("반려동물 없음"));
        return new PetResponse(
                pet.getId(),
                pet.getName(),
                pet.getSpecies(),
                pet.getBreed(),
                pet.getBirthDate(),
                pet.getImageUrl()
        );
    }

    //updatePet
    public void updatePet(Long petId, PetUpdateRequest request) {
        PetEntity pet = petRepository.findById(petId)
                .orElseThrow(()-> new IllegalArgumentException("반려동물 없음"));
        pet.update(
                request.getName(),
                request.getSpecies(),
                request.getBreed(),
                request.getBirthDate(),
                request.getImageUrl()
        );

    }

    //deletePet
    public void deletePet(Long petId) {
        petRepository.deleteById(petId);
    }
}
