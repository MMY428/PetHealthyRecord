package com.domain.pethealthyrecord.healthrecord.service;

import com.domain.pethealthyrecord.healthrecord.entity.HealthrecordEntity;
import com.domain.pethealthyrecord.healthrecord.repository.HealthrecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class HealthrecordService {

    private final HealthrecordRepository healthrecordRepository;

    //createHealthrecord
    @Transactional
    public void createHealthrecord(HealthrecordRequest request) {
        Healthrecord healthrecord = HealthrecordEntity.builder()
    }

    //getHealthrecords

    //getHealthrecord

    //updateHealthrecord

    //deleteHealthrecord
}
