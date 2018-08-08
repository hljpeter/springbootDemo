package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("controller")
public class demoController {

    @RequestMapping("demo")
    public String demo () {
        return "demo";
    }
}
