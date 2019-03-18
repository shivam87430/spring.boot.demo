package com.spring.spring.boot.demo.service;

import com.spring.spring.boot.demo.entity.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return Arrays.asList(new Student(1,"Shivam","Saxena"),new Student(2,"Vineet","Chaudhary"));
    }

}
