package com.p6spy.demo.service.impl;

import com.p6spy.demo.mapper.TestMapper;
import com.p6spy.demo.model.Test;
import com.p6spy.demo.service.P6spyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class P6spyServiceImpl implements P6spyService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> selectTest() {
        return testMapper.selectTest(1);
    }
}
