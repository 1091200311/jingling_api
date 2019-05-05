package com.soft1611.jingling.demo.service;

import com.soft1611.jingling.demo.entity.Entertainment;

import java.util.List;

public interface EntertainmentService {
    List<Entertainment> getAll();
    List<Entertainment> getEntertainmentByNameLike(String keywords);
    //根据id查询用户
    Entertainment getEntertainment(Integer id);
}
