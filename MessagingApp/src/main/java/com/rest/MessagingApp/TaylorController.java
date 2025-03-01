package com.rest.MessagingApp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class TaylorController {

    @PutMapping("/put/{firstName}")
    public String updateHello(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
