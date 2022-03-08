package com.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<String> getUsers(){
        final List<String> users = new ArrayList<>();
        users.add("Jasper");
        users.add("Mike");
        users.add("Doris");
        return users;
    }

}
