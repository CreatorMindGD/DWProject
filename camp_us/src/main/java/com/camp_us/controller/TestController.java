package com.camp_us.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
    
    @GetMapping("/home")
    public String home(Model model) {
    	model.addAttribute("serverTime", LocalDateTime.now());
        return "test/home";
    }
}
