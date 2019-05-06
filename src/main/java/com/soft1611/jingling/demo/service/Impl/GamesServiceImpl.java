package com.soft1611.jingling.demo.service.Impl;

import com.soft1611.jingling.demo.dao.GamesRepository;
import com.soft1611.jingling.demo.entity.Games;
import com.soft1611.jingling.demo.service.GamesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GamesServiceImpl implements GamesService {
    @Resource
    private GamesRepository gamesRepository;

    @Override
    public List<Games> getAll() {
        return gamesRepository.findAll();
    }
}
