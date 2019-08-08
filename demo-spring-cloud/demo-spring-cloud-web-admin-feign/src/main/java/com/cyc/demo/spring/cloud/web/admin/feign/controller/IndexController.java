package com.cyc.demo.spring.cloud.web.admin.feign.controller;

import com.cyc.demo.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private AdminService adminService;
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(String message) {
        return adminService.aaa(message);
    }
}
