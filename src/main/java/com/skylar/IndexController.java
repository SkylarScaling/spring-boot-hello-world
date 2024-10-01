package com.skylar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class IndexController {
    @GetMapping("/")
    public HashMap helloWorld() {
        return new HashMap<>(){{
            put("Message", "Hello Spring Boot!");
        }};
    }
}
