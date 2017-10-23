package com.hikuley.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hikuley 23.10.2017 4:34 PM
 */

@RestController
@RequestMapping(value = "/api")
public class TestRestController {

    @GetMapping("/health-check")
    public String healthCheck() {
        return "ok";
    }

    @GetMapping("/secured")
    public String secured() {
        return "secured";
    }
}
