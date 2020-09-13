package com.aaron.springbootdemo.service;


import org.springframework.stereotype.Service;

@Service
public class FirstService {

    public String processRequest(int id, String name) {
        return "id:" + id + " name:" + name;
    }

}
