package com.soft1611.jingling.demo.controller;

import com.soft1611.jingling.demo.entity.Education;
import com.soft1611.jingling.demo.entity.Games;
import com.soft1611.jingling.demo.service.GamesService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@RestController
@RequestMapping("/games")
@CrossOrigin("*")
public class GamesController {
    @Resource
    private GamesService gamesService;
    @GetMapping("/all")
    public List<Games> getAll(){
        return gamesService.getAll();
    }
}
