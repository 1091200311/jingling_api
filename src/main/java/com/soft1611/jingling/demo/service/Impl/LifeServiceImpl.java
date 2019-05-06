package com.soft1611.jingling.demo.service.Impl;

import com.soft1611.jingling.demo.dao.LifeRepository;
import com.soft1611.jingling.demo.entity.Life;
import com.soft1611.jingling.demo.service.LifeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class LifeServiceImpl implements LifeService {
    @Resource
    private LifeRepository lifeRepository;
    @Override
    public List<Life> getAll() {
        return lifeRepository.findAll();
    }
}
