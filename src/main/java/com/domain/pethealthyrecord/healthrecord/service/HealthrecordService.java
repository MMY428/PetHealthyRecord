package com.domain.pethealthyrecord.healthrecord.service;

import com.domain.pethealthyrecord.healthrecord.dto.HealthrecordCreateRequest;
import com.domain.pethealthyrecord.healthrecord.dto.HealthrecordResponse;
import com.domain.pethealthyrecord.healthrecord.dto.HealthrecordUpdateRequest;
import com.domain.pethealthyrecord.healthrecord.entity.HealthrecordEntity;
import com.domain.pethealthyrecord.healthrecord.repository.HealthrecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class HealthrecordService {

    private final HealthrecordRepository healthrecordRepository;

    //createHealthrecord
    @Transactional
    public void createHealthrecord(HealthrecordCreateRequest request) {
        HealthrecordEntity healthrecord = HealthrecordEntity.builder()
    }

    //getHealthrecords
    public List<HealthrecordResponse> getHealthrecords() {

    }

    //getHealthrecord
    public HealthrecordResponse getHealthrecord() {

    }

    //updateHealthrecord
    @Transactional
    public void updateHealthrecord(HealthrecordUpdateRequest request){

    }

    //deleteHealthrecord
    @Transactional
    public void deleteHealthrecord()
}
