package com.domain.pethealthyrecord.healthrecord.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class HealthrecordCreateRequest {

    @NotNull(message = "반려동물 ID를 입력하세요")
    private Long petId;

    @NotNull(message = "몸무게를 입력하세요")
    private Double weight;

    @NotNull(message = "식사량을 입력하세요")
    private Integer foodAmount;

    @NotBlank(message = "증상을 입력하세요")
    private String symptom;

    @NotBlank(message = "추가 메모")
    private String memo;

    @NotBlank(message = "증상 사진 URL을 입력하세요")
    private String imageUrl;

    @NotNull(message = "기록 시간")
    private LocalDateTime recordedAt;
}
