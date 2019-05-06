package com.soft1611.jingling.demo.dao;

import com.soft1611.jingling.demo.entity.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MusicRepository extends JpaRepository<Music,Integer> {
    @Query("From Music  a ORDER BY a.likes DESC ")
    List<Music> findHotMusic();
}
