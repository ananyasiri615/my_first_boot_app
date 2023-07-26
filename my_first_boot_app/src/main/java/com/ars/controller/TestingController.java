package com.ars.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestingController {

    @RequestMapping("/welcome")
    public String welcome() {
        return "Welcome to your first spring boot application";
    }

    @RequestMapping("/home")
    public String home() {
        return "This is the home url";
    }

}