package com.domain.pethealthyrecord.pet.repository;

import com.domain.pethealthyrecord.pet.entity.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<PetEntity, Long> {
}

