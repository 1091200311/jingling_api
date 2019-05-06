package com.soft1611.jingling.demo.dao;

import com.soft1611.jingling.demo.entity.Games;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GamesRepository extends JpaRepository<Games,Integer> {
    List<Games> findByName(String keywords);
}
