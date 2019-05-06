package com.soft1611.jingling.demo.dao;

import com.soft1611.jingling.demo.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EducationRepository extends JpaRepository<Education,Integer> {
    List<Education> findByName(String keywords);
}
