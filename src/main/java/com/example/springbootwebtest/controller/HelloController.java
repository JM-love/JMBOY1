package com.example.springbootwebtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {


    @GetMapping("/{name}")
    public String hello(@PathVariable("name") String name){
        System.out.println("调用了controller");
        return "Hello"+name;
    }
}
