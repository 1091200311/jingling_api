package com.soft1611.jingling.demo.service.Impl;

import com.soft1611.jingling.demo.dao.ToolsRepository;
import com.soft1611.jingling.demo.entity.Tools;
import com.soft1611.jingling.demo.service.ToolsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ToolsServiceImpl implements ToolsService {
    @Resource
    private ToolsRepository toolsRepository;
    @Override
    public List<Tools> getAll() {
        return toolsRepository.findAll();
    }
}
