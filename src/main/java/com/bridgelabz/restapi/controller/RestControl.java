package com.bridgelabz.restapi.controller;


import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestControl {

    @GetMapping("/home")
    public String home(){
        return "Hello from Bridgelab";
    }


    //localhost:8085/query?name=Mark
    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello "+name+" From BridgeLabz";
    }

    // localhost:8085/hello/{Mark}
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return "Hello " +name+ " from Bridgelabz";
    }

    @PostMapping("/hello")
    public String getFirstLastName(@RequestBody User user){
        return "Hello "+ user.getFirstName() +" "+ user.getLastName() +" from Bridgelabz";
    }


    //localhost:8085/hello/put/Praveen?lastName=Kumar
    @PutMapping("/hello/put/{firstName}")
    public String sayHelloWithPut(@PathVariable String firstName, @RequestParam String lastName){
        return "Hello " + firstName + " " + lastName + " from Bridgelabz";
    }

}
