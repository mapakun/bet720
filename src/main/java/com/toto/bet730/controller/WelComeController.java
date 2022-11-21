package com.toto.bet730.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelComeController
{

    @GetMapping("/")
    public String welComePage()
    {
        return "welCome";
    }
}
