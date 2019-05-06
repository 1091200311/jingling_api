package com.soft1611.jingling.demo.dao;

import com.soft1611.jingling.demo.entity.Tools;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToolsRepository extends JpaRepository<Tools,Integer> {
    List<Tools> findByName(String keywords);
}
