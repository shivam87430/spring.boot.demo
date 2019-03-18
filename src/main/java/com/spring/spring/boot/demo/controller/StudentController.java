package com.spring.spring.boot.demo.controller;

import com.spring.spring.boot.demo.entity.Student;
import com.spring.spring.boot.demo.event.Bootstrap;
import com.spring.spring.boot.demo.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    Bootstrap bootstrap;


    Logger logger= LoggerFactory.getLogger(StudentController.class);

    @GetMapping("/")
    public List<Student> getStudent() {
        bootstrap.init();
        logger.info("......Enter get Students......");
        return studentService.getStudents();
    }
}
