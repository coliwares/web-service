package com.example.copilot.webservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld(@PathVariable String name) {
        String message = name == null ? "" : name;
        return "Hello World " + message;
    }

}
