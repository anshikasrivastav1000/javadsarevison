package com.code.journalApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//special type of component
//with addinialy fancunality
//yha par end ponits likhe ge as method

@RestController
public class HealthCheck {

    @GetMapping("/health-check")
    public String healthCheck(){
        return "ok";
    }



}
