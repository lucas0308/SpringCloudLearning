package com.sc.servicehystrixfeign.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceHiFeignHystrix implements ServiceHiFeign {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name + ", server down";
    }
}
