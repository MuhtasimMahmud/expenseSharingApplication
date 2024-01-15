package com.project.expenseSharingApplication.controllers;

import com.project.expenseSharingApplication.models.User;
import com.project.expenseSharingApplication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class userController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/testing")
    @ResponseBody
    public String test(){
        User user = new User(1, "Mahmud", "muhtasim.mzs16@gmail.com", 11, true, "pass", "imgUrl");
        userRepository.save(user);
        return "working";
    }

}
