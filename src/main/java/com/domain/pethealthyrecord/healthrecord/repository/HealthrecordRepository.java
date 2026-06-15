package com.domain.pethealthyrecord.healthrecord.repository;

import com.domain.pethealthyrecord.healthrecord.entity.HealthrecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthrecordRepository extends JpaRepository<HealthrecordEntity, Long> {
}
