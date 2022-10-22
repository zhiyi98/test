package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @GetMapping("/test1")
    public String test1(){
        return "hello,test1~";
    }
    
    @GetMapping("/test2")
    public String test2(){
        return "hello,test2~";
    }
    
    @GetMapping("/test3")
    public String test3(){
        return "hello,test3~";
    }

    @GetMapping("/test4")
    public String test3(){
        return "hello,test3~";
    }
    
}
