package com.soft1611.jingling.demo.dao;

import com.soft1611.jingling.demo.entity.Life;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LifeRepository extends JpaRepository<Life,Integer> {
    List<Life> findByName(String Keywords);
}
