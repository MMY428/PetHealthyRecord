package com.domain.pethealthyrecord.pet.service;

import com.domain.pethealthyrecord.pet.dto.PetCreateRequest;
import com.domain.pethealthyrecord.pet.entity.PetEntity;
import com.domain.pethealthyrecord.pet.repository.PetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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

    //getPet

    //updatePet

    //deletePet
}
