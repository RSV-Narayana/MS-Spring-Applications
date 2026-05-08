package com.example.authservice.controller;

import com.example.authservice.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @GetMapping("/test")
    public String test() {
        return authService.testAPI();
    }

    @GetMapping("/test-error")
    public void throwError(){
        throw new RuntimeException("Testing Common Library Error!");
    }
}