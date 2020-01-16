package com.p6spy.demo.controller;

import com.p6spy.demo.model.Test;
import com.p6spy.demo.service.P6spyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zyz
 * <p>
 * 测试控制器
 */
@RestController
public class P6spyController {

    @Autowired
    private P6spyService p6spyService;

    @RequestMapping("/test")
    public List<Test> test() {

        return p6spyService.selectTest();
    }
}
