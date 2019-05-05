package com.soft1611.jingling.demo.service.Impl;

import com.soft1611.jingling.demo.dao.EntertainmentRepository;
import com.soft1611.jingling.demo.entity.Entertainment;
import com.soft1611.jingling.demo.service.EntertainmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EntertainmentServiceImpl implements EntertainmentService {
    @Resource
    private EntertainmentRepository entertainmentRepository;

    @Override
    public List<Entertainment> getAll() {
        return entertainmentRepository.findAll();
    }

    @Override
    public List<Entertainment> getEntertainmentByNameLike(String keywords) {
        return entertainmentRepository.findByName(keywords);
    }

    @Override
    public Entertainment getEntertainment(Integer id) {
        return entertainmentRepository.findById(id).get();
    }
}
