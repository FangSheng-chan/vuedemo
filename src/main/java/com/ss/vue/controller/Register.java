package com.ss.vue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ss
 */
@RestController
public class Register {

    @GetMapping("/register")
    public String register(String password,String mail){
        System.out.println(password);
        System.out.println(mail);
        return "register success";
    }
}
