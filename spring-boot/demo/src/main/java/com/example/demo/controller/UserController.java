package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/")
    public String Greeding(){
        return "Hello From user";
    }

    @PostMapping("/signup")
    public String Signup(@RequestBody User user){
        return "signup user " + user.repr();
    }

    @PostMapping("/login")
    public String Login(@RequestBody User user){
        return "login user " + user.repr();
    }
}
