package com.rest.MessagingApp;
import org.springframework.web.bind.annotation.*;

@RestController  // Marks this class as a REST Controller
@RequestMapping("/api")  // Base URL for this controller
public class HelloRestController {

    // Handle GET Request
    @GetMapping("/hello")
    public String getHello() {
        return "Hello from BridgeLabz - GET Request!";
    }

    // Handle POST Request
    @PostMapping("/hello")
    public String postHello() {
        return "Hello from BridgeLabz - POST Request!";
    }

    // Handle PUT Request
    @PutMapping("/hello")
    public String putHello() {
        return "Hello from BridgeLabz - PUT Request!";
    }

    // Handle DELETE Request
    @DeleteMapping("/hello")
    public String deleteHello() {
        return "Hello from BridgeLabz - DELETE Request!";
    }
}
