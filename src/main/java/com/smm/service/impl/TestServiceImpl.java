package com.smm.service.impl;

import com.smm.entity.Test;
import com.smm.mapper.TestMapper;
import com.smm.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("testService")
public class TestServiceImpl implements TestService {

    private TestMapper testMapper;
//
//    @Autowired
//    public TestServiceImpl(TestMapper testMapper) {
//        this.testMapper = testMapper;
//    }

    public List<Test> Testone() {
        List<Test> all = testMapper.findAll();
        return all;
    }
}
