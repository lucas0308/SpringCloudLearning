package com.sc.servicehi2.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceHiFeignHystrix implements ServiceHiFeign {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name + ", server down";
    }
}
