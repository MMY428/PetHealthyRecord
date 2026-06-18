package com.domain.pethealthyrecord.pet.service;

import com.domain.pethealthyrecord.pet.dto.PetCreateRequest;
import com.domain.pethealthyrecord.pet.dto.PetResponse;
import com.domain.pethealthyrecord.pet.dto.PetUpdateRequest;
import com.domain.pethealthyrecord.pet.entity.PetEntity;
import com.domain.pethealthyrecord.pet.repository.PetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PetService {

    private final PetRepository petRepository;

    //createPet
    @Transactional
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
        PetEntity pet = findPet(petId);
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
    @Transactional
    public void updatePet(Long petId, PetUpdateRequest request) {
        PetEntity pet = findPet(petId);
        pet.update(
                request.getName(),
                request.getSpecies(),
                request.getBreed(),
                request.getBirthDate(),
                request.getImageUrl()
        );

    }

    //deletePet
    @Transactional
    public void deletePet(Long petId) {
        PetEntity pet = findPet(petId);
        petRepository.delete(pet);
    }

    private PetEntity findPet(Long petId) {
        return petRepository.findById(petId)
                .orElseThrow(() -> new IllegalArgumentException("반려동물 없음"));
    }
}
