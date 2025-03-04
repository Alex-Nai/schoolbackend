package com.example.schoolbackend.dto;

public class BuildingStatus {

    private Long totalRooms;
    private Long availableRooms;
    private Long occupiedRooms;

    // 构造函数，用于接收查询结果的三列值
    public BuildingStatus(Long totalRooms, Long availableRooms, Long occupiedRooms) {
        this.totalRooms = totalRooms;
        this.availableRooms = availableRooms;
        this.occupiedRooms = occupiedRooms;
    }

    // Getter 和 Setter 方法
    public Long getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(Long totalRooms) {
        this.totalRooms = totalRooms;
    }

    public Long getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(Long availableRooms) {
        this.availableRooms = availableRooms;
    }

    public Long getOccupiedRooms() {
        return occupiedRooms;
    }

    public void setOccupiedRooms(Long occupiedRooms) {
        this.occupiedRooms = occupiedRooms;
    }
}
