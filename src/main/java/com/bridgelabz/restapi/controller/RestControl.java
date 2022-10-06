package com.bridgelabz.restapi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControl {

    @GetMapping("/home")
    public String home(){
        return "Hello from Bridgelab";
    }

}
