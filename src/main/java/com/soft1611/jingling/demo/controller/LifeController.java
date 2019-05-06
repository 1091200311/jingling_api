package com.soft1611.jingling.demo.controller;

import com.soft1611.jingling.demo.entity.Life;
import com.soft1611.jingling.demo.service.LifeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/life")
@CrossOrigin("*")
public class LifeController {
    @Resource
    private LifeService lifeService;
    @GetMapping("/all")
    public List<Life> getAll(){
        return  lifeService.getAll();
    }

}
