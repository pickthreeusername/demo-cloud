package com.cyc.demo.spring.cloud.web.admin.ribbon.Controller;

import com.cyc.demo.spring.cloud.web.admin.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private AdminService adminService;
    @RequestMapping("test")
    public String test(String message) {
        return adminService.test(message);
    }
}
