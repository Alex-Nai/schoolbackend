package com.example.schoolbackend.repository;

import com.example.schoolbackend.dto.BuildingStatus;
import com.example.schoolbackend.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {

    // 按楼宇名称查找
    List<Resource> findByBuilding(String building);

    // 查找讲座资源
    @Query("SELECT r FROM Resource r WHERE r.type = '讲座'")
    List<Resource> findLectureResources();

    // 查找实验室资源
    @Query("SELECT r FROM Resource r WHERE r.type = '实验室'")
    List<Resource> findLabResources();

    // 计算特定楼宇的状态
    @Query("SELECT new com.example.schoolbackend.dto.BuildingStatus( "
            + "COUNT(r), "
            + "SUM(CASE WHEN r.status = 'available' THEN 1 ELSE 0 END), "
            + "SUM(CASE WHEN r.status = 'occupied' THEN 1 ELSE 0 END)) "
            + "FROM Resource r WHERE r.buildingName = :buildingName AND r.type = 'classroom'")
    BuildingStatus getBuildingStatus(@Param("buildingName") String buildingName);
}
