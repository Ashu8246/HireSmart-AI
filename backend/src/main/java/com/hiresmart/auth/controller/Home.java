package com.hiresmart.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/")
    public String index() {
        return "Application Started without any error.....!";
    }

    @GetMapping("/home")
    public String home() {
        return "Welcome to the Home Page!";
    }
}
