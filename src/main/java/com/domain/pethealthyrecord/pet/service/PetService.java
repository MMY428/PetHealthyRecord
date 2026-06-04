package com.domain.pethealthyrecord.pet.service;

import com.domain.pethealthyrecord.pet.repository.PetRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PetService {

    private final PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    //createPet

    //getPets

    //getPet

    //updatePet

    //deletePet
}
