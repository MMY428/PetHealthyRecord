package com.domain.pethealthyrecord.healthrecord.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class HealthrecordResponse {
    private Long petId;
    private Double weight;
    private Integer foodAmount;
    private String symptom;
    private String memo;
    private String imageUrl;
    private LocalDateTime recordedAt;
}
