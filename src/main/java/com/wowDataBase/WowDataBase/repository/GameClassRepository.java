package com.wowDataBase.WowDataBase.repository;


import com.wowDataBase.WowDataBase.modules.GameClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameClassRepository extends JpaRepository<GameClass, Long> {
    // Custom query methods can be defined here
}