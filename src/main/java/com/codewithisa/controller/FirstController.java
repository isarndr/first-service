package com.codewithisa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first-controller")
public class FirstController {


    @GetMapping("/test1")
    public String test1() {
        System.out.println("first controller is executed");
        return "first controller is executed";
    }
}
