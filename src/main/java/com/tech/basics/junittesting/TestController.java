package com.tech.basics.junittesting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class TestController {

    @GetMapping()
    public String get (){
        return "I am in persons";
    }
}
