package com.soft1611.jingling.demo.service.Impl;

import com.soft1611.jingling.demo.dao.EducationRepository;
import com.soft1611.jingling.demo.entity.Education;
import com.soft1611.jingling.demo.service.EducationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class EducationServiceImpl implements EducationService {
    @Resource
    private EducationRepository educationRepository;

    @Override
    public List<Education> getAll() {
        return educationRepository.findAll();
    }

}
