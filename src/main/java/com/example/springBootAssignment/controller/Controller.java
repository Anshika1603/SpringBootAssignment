package com.example.springBootAssignment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
@RestController
public class Controller {
    @RequestMapping("/status")
    public String getStatus() {
        return "Running, {"+LocalTime.now()+"}";
    }
}
