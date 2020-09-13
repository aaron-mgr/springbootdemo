package com.aaron.springbootdemo.cotroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "*", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String getFallback() {
        return "Fallback for GET Requests";
    }
}