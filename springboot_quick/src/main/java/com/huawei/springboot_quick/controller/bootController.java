package com.huawei.springboot_quick.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bootController {

    @RequestMapping("/quick")
    public String quick(){
        return "siergou";
    }
}
