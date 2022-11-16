package com.demo1.demo.controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class ProductController {

    @GetMapping("/product")
    public String demo() {
        return "demo";
    }


    @GetMapping("/json")
    public Map<String, Object> getJson() {
        Map<String, Object> map = new HashMap<>();
        map.put("data", null);
        map.put("message", "test json");
        map.put("bypass", false);
        return map;
    }
    
}
