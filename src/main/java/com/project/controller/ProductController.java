package com.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<String> getProducts(){
        final List<String> products = new ArrayList<>();
        products.add("Hammer");
        products.add("Drill");
        products.add("Dryer");
        return products;
    }

}
