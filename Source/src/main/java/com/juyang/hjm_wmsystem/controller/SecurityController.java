package com.juyang.hjm_wmsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JuYang
 * @date 2021年12月15日23:25
 */
@RestController
@RequestMapping("/hello")
public class SecurityController {
    @GetMapping
    public String getUser(){
        return "SecurityController";
    }
}
