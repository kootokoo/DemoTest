package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping
    public String hello(){
        return "Hello";
    }

    @GetMapping("/hello")
    public String main(){
        int a=1;
        return "main";
    }

}
