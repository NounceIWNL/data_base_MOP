package com.wowDataBase.WowDataBase.repository;


import com.wowDataBase.WowDataBase.models.GameClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameClassRepository extends JpaRepository<GameClass, Long> {
    // Custom query methods can be defined here
}