package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class demoController{

    @GetMapping
    public String welcome() {
        return "Welcome in your first com.example.demo.controller";
    }


}
