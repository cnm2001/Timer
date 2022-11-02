package com.ess.timer.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/aop")
@Component
public class UsrController {

    @GetMapping
    public String get() {
        return "ndd";
    }
}
