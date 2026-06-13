package com.domain.pethealthyrecord.pet.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

//등록 요청
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PetCreateRequest {
    @NotBlank(message = "이름을 입력하세요")
    private String name;

    @NotBlank(message = "종을 입력하세요")
    private String species;

    @NotBlank(message = "품종을 입력하세요")
    private String breed;

    @NotNull(message = "생년월일을 입력하세요")
    private LocalDate birthDate;

    @NotBlank(message = "이미지 URL을 입력하세요")
    private String imageUrl;
}
