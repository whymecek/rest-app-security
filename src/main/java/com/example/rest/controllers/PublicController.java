package com.example.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PublicController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome, this endpoint is not secure";
    }
}
