package com.domain.pethealthyrecord.pet.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "pet")
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class PetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pet_name", nullable = false)
    @NotBlank(message = "이름 적으세요")
    private String name;

    @Column(name = "pet_species", nullable = false)
    @NotBlank(message = "종 적으세요")
    private String species;

    @Column(name = "pet_breed", nullable = false)
    @NotBlank(message = "품종 적으세요")
    private String breed;

    @Column(name = "pet_birthDate", nullable = false)
    @NotNull
    private LocalDate birthDate;

    @Column(name = "pet_imageUrl", nullable = false)
    @NotBlank(message = "이미지 넣으세요")
    private String imageUrl;
}
