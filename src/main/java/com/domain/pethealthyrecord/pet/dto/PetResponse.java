package com.domain.pethealthyrecord.pet.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

//조회 응답
@Getter
@NoArgsConstructor
public class PetResponse {
    private Long id;
    private String name;
    private String species;
    private String breed;
    private LocalDate birthDate;
    private String imageUrl;
}
