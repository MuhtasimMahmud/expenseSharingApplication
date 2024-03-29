package com.project.expenseSharingApplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("Title","Home");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("Title", "About");
        return "about";
    }



}
