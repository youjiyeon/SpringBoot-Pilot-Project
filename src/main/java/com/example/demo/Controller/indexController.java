package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class indexController {
    @GetMapping("/")
    public @ResponseBody String index() {
        return "Hello, World!!";
    }

    @GetMapping("/fire")
    public String fire() {
        return "views/fire";
    }
    
}