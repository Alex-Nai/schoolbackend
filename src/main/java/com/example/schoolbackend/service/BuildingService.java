package com.example.schoolbackend.service;

import com.example.schoolbackend.dto.BuildingStatus;
import com.example.schoolbackend.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuildingService {

    @Autowired
    private ResourceRepository resourceRepository;

    // 获取主楼状态
    public BuildingStatus getBuildingStatus(String buildingName) {
        return resourceRepository.getBuildingStatus(buildingName);
    }

    // 获取中楼状态
    public BuildingStatus getMiddleBuildingStatus() {
        return resourceRepository.getBuildingStatus("Middle Building");
    }
}
