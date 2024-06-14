package com.example.demoex2.controller;

import com.example.demoex2.model.User;
import com.example.demoex2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
    public class UserController {

    private final UserService userService;

    @GetMapping("/login")
    public String loginPage(){return "login";}

    @GetMapping("/registration")
    public String registrationPage(){return "registration";}

    @PostMapping("/registration")
    public String registration(User user){
    userService.save(user);
    return "redirect:/login";
    }
}
