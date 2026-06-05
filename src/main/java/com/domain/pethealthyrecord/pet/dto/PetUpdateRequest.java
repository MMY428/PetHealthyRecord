package com.domain.pethealthyrecord.pet.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class PetUpdateRequest {
    private String name;
    private String species;
    private String breed;
    private LocalDate birthDate;
    private String imageUrl;
}
