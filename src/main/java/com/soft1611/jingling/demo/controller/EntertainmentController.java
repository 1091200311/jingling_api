package com.soft1611.jingling.demo.controller;

import com.soft1611.jingling.demo.entity.Entertainment;
import com.soft1611.jingling.demo.service.EntertainmentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/entertainment")
@CrossOrigin("*")
public class EntertainmentController {
    @Resource
    private EntertainmentService entertainmentService;
    @GetMapping("/all")
    public List<Entertainment> getAll(){
        return entertainmentService.getAll();
    }
    @GetMapping("/{id}")
    public Entertainment getEntertainment(@PathVariable Integer id) {
        return entertainmentService.getEntertainment(id);
    }

}
