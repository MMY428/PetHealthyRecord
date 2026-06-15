package com.domain.pethealthyrecord.healthrecord.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "healthyRecord")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class HealthrecordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long petId;

    @Column(name = "healthyRecord_weight", nullable = false)
    @NotNull(message = "몸무게 적으시오")
    private Double weight;

    @Column(name = "healthyRecord_foodAmount", nullable = false)
    @NotNull(message = "식사량 적으시오")
    private Integer foodAmount;

    @Column(name = "healthyRecord_symptom", nullable = false)
    @NotBlank(message = "증상 적으세오")
    private String symptom;

    @Column(name = "healthyRecord_memo", nullable = false)
    @NotBlank(message = "추가 메모")
    private String memo;

    @Column(name = "healthyRecord_imageUrl", nullable = false)
    @NotBlank(message = "증상 사진")
    private String imageUrl;

    @Column(name = "healthyRecord_recordedAt", nullable = false)
    @NotNull(message = "기록 시간")
    private LocalDateTime recordedAt;
}
