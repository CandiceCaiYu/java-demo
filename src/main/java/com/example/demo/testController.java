package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class testController {
    @GetMapping("/home")
    public String hello() {
        return "Hello world!";
    }

    @GetMapping("/homes")
    public List<String> hellos() {
        return List.of("Hello", "World");
    }
}
