package com.example.test.controller;

import com.demo.starter.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
public class DemoController {
    @Resource(name = "demo")
    private DemoService demoService;

    @Resource(name = "demo1")
    private DemoService demoService2;

    @GetMapping("/say")
    public String sayWhat() {
        return demoService.say();
    }

    @GetMapping("/say2")
    public String sayWhat2() {
        return demoService2.say();
    }
}
