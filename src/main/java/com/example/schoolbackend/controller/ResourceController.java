package com.example.schoolbackend.controller;

import com.example.schoolbackend.entity.Resource;
import com.example.schoolbackend.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resources")
public class ResourceController {

    @Autowired
    private ResourceRepository resourceRepository;

    @GetMapping
    public List<Resource> getAllResources() {
        return resourceRepository.findAll();
    }

    // ✅ 获取主楼教室信息
    @GetMapping("/main-building")
    public List<Resource> getMainBuildingRooms() {
        return resourceRepository.findByBuilding("主楼");
    }

    // ✅ 获取中楼教室信息
    @GetMapping("/middle-building")
    public List<Resource> getMiddleBuildingRooms() {
        return resourceRepository.findByBuilding("中楼");
    }

    // ✅ 获取讲座资源信息
    @GetMapping("/lectures")
    public List<Resource> getLectureResources() {
        return resourceRepository.findLectureResources();
    }

    // ✅ 获取实验室资源信息
    @GetMapping("/labs")
    public List<Resource> getLabResources() {
        return resourceRepository.findLabResources();
    }
}

