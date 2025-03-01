package com.rest.MessagingApp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class DTOController {

    @PostMapping("/post")
    public String sayHello(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}
