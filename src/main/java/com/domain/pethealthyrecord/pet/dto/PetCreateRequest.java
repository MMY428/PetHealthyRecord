package com.domain.pethealthyrecord.pet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class PetCreateRequest {
    private String name;
    private String species;
    private String breed;
    private LocalDate birthDate;
    private String imageUrl;
}
