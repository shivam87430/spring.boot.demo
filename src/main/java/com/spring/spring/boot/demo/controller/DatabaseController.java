package com.spring.spring.boot.demo.controller;

import com.spring.spring.boot.demo.entity.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {

    @Autowired
    Database database;

    @GetMapping("/database")
    public String getDatabase(){
        return database.toString();
    }
}
