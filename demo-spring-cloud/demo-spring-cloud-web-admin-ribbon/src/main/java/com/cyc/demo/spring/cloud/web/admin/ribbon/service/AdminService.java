package com.cyc.demo.spring.cloud.web.admin.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {
    @Autowired
    private RestTemplate restTemplate;

    public String test(String message) {
        return restTemplate.getForObject("http://demo-spring-cloud-service-admin/test?message=" + message, String.class);
    }
}
