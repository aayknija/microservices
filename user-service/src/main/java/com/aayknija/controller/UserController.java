package com.aayknija.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String greet(){
        return "Hello buddy from user-service";
    }
}
