package com.example.apigateway.controller;

import com.example.apigateway.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms/apigateway")
public class ApiController {
    @Autowired
    private ApiService apiService;

    @GetMapping("/test")
    public String test() {
        return apiService.testAPI();
    }

    @GetMapping("/app2/{type}")
    public String processData(@PathVariable String type) {
        return apiService.processData(type);
    }
}
