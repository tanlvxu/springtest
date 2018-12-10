package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.event.ObjectChangeListener;

@RestController
public class DemoWeb {
    @RequestMapping("/hello")
    public Object hello(){
        return "hello";
    }
}
