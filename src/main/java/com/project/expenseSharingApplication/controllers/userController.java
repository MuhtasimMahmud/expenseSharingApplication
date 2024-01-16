package com.project.expenseSharingApplication.controllers;

import com.project.expenseSharingApplication.models.User;
import com.project.expenseSharingApplication.models.messGroup;
import com.project.expenseSharingApplication.models.month;
import com.project.expenseSharingApplication.repositories.UserRepository;
import com.project.expenseSharingApplication.repositories.messGroupRepository;
import com.project.expenseSharingApplication.repositories.monthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

@Controller
public class userController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private messGroupRepository messGroupRepository;

    @Autowired
    private monthRepository monthRepository;


    @GetMapping("/testing")
    @ResponseBody
    public String test(){
        User user = new User(1, "Mahmud", "muhtasim.mzs16@gmail.com", 11, true, "pass", "imgUrl");
        userRepository.save(user);
        return "working";
    }

    @GetMapping("/test2")
    @ResponseBody
    public String test2(){

        messGroup group1 = new messGroup(1, "mess", 50);

        List<User> userList = new ArrayList<>();
        User user1 = new User(2, "abc", "abc@gmail.com", 1, true, "pass", "img");
        User user2 = new User(3, "eec", "eec@gmail.com", 1, true, "pass", "img");
        userList.add(user1);
        userList.add(user2);
        group1.setUserList(userList);

        userRepository.save(user1);
        userRepository.save(user2);
        messGroupRepository.save(group1);

        return "mess group1 is working";
    }

    @GetMapping("/test3")
    @ResponseBody
    public String test3(){

        messGroup group2 = new messGroup(2, "amader mess", 45);

        List<User> userList = new ArrayList<>();
        User user3 = new User(4, "abc", "rrc@gmail.com", 2, true, "pass", "img");
        User user4 = new User(5, "eec", "ttc@gmail.com", 2, true, "pass", "img");
        userList.add(user3);
        userList.add(user4);
        group2.setUserList(userList);

        userRepository.save(user3);
        userRepository.save(user4);
        messGroupRepository.save(group2);

        return "mess group2 is working";
    }

    @GetMapping("/test4")
    @ResponseBody
    public String test4(){
        month month = new month(Month.NOVEMBER, Year.of(2024), 5000, 3000, 2000, 1000, 500);
        month.setmID("November"+"2024");
        monthRepository.save(month);
        return "month is working";
    }




}
