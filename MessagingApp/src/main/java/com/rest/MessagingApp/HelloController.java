package com.rest.MessagingApp;

import org.springframework.web.bind.annotation.*;

@RestController  // Defines this class as a REST Controller
@RequestMapping("/hello")  // Base URL for this controller
public class HelloController {

    // GET request with a query parameter
    @GetMapping("/query")
    public String sayHello(@RequestParam(name = "name", defaultValue = "Guest") String name) {
        return "Hello " + name + " from BridgeLabz!";
    }
}
