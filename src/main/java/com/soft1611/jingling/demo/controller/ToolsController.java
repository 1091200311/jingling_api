package com.soft1611.jingling.demo.controller;

import com.soft1611.jingling.demo.entity.Tools;
import com.soft1611.jingling.demo.service.ToolsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/tools")
@CrossOrigin("*")
public class ToolsController {
    @Resource
    private ToolsService toolsService;
    @GetMapping("/all")
    public List<Tools> getAll(){
        return toolsService.getAll();

    }

}
