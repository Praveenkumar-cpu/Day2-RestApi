package com.bridgelabz.restapi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControl {

    @GetMapping("/home")
    public String home(){
        return "Hello from Bridgelab";
    }

    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello "+name+" From BridgeLabz";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello "+name+" From BridgeLabz";
    }

}
