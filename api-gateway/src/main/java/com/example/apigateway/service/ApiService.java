package com.example.apigateway.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class ApiService {

    private final RestClient restClient;

    public ApiService(RestClient rc){
        this.restClient = rc;
    }

    public String processData(String input){
        if("auth-external".equals(input)){
            // Simulate calling an external authentication service
            return restClient.get().uri("/ms/auth/test").retrieve().body(String.class);
//                    getForObject("http://auth-service/validate", String.class);
        }
//        else if("data-external".equals(input)){
//            // Simulate calling an external data service
//            return restClient.getForObject("http://data-service/fetch", String.class);
//        }

        else {
            // Process data internally
            return "Processed: " + input;
        }
    }

    public String testAPI() {
        return "API Gateway Service is working!";
    }
}
