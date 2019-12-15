package com.agharibi.springsecurityldap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {

    @GetMapping("/")
    public String index() {
        return "Home page";
    }
}
