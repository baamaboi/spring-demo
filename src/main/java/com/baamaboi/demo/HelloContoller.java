package com.baamaboi.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloContoller {

    @GetMapping("/")
    public String index(){
        return "Hello World, from SpringBoot";
    }
}
