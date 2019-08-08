package com.cyc.demo.spring.cloud.web.admin.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "demo-spring-cloud-service-admin")
public interface AdminService {
    @RequestMapping(value = "test", method = RequestMethod.GET)
    //与方法无关，可以跟服务不一样，但 @RequestParam 必须要，否则 405
    public String aaa(@RequestParam String message);
}
