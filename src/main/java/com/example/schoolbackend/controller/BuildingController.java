package com.example.schoolbackend.controller;

import com.example.schoolbackend.dto.BuildingStatus;
import com.example.schoolbackend.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/building")
public class BuildingController {

    @Autowired
    private BuildingService buildingService;

    // 获取主楼状态
    @GetMapping("/main/rooms/status")
    public ResponseEntity<BuildingStatus> getMainBuildingStatus() {
        BuildingStatus status = buildingService.getBuildingStatus("Main Building");
        return ResponseEntity.ok(status);
    }

    // 获取中楼状态
    @GetMapping("/middle/rooms/status")
    public ResponseEntity<BuildingStatus> getMiddleBuildingStatus() {
        BuildingStatus status = buildingService.getMiddleBuildingStatus();
        return ResponseEntity.ok(status);
    }
}
