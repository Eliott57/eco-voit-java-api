package com.ecovoit.EcoVoitAPI.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @GetMapping("/")
    public String home() {
        return "Bienvenu sur EcoVoit";
    }
}
