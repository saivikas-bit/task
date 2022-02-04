package com.example.task.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @RequestMapping(path = "/",method = RequestMethod.GET)
    public String helloWorld(){
        return "hello world sai viki vikas";
    }

}
