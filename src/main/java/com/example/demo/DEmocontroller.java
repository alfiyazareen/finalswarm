package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DEmocontroller {
    @CrossOrigin ("*")
    @GetMapping("/hello")

    public String sayhello(){
        return "hello from alfiya";
    }

}
