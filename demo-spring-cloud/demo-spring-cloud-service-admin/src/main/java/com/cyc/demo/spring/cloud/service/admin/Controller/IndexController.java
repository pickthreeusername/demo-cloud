package com.cyc.demo.spring.cloud.service.admin.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Value("${server.port}")
    private int port;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String index(String message) {
        return String.format("spring cloud service test : message is %s; port is : %s", message, port);
    }

}
