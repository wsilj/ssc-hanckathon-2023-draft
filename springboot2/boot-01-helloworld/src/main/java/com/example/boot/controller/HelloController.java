package com.example.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ma-er
 */

@RestController
public class HelloController {

    @RequestMapping("/")
    public String handle01() {
        return "Hello, Spring Boot on Azure!";
    }

}
