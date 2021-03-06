package com.soft1611.jingling.demo.dao;

import com.soft1611.jingling.demo.entity.Entertainment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntertainmentRepository extends JpaRepository<Entertainment,Integer> {
    List<Entertainment> findByName(String keywords);
}
