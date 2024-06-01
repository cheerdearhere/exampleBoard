package com.dreamik.myboard2024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        System.out.println("## controller complete!!");
        return "index";
    }
}
