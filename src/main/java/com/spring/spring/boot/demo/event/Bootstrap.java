package com.spring.spring.boot.demo.event;

import com.spring.spring.boot.demo.entity.Student;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap {

    @EventListener(Student.class)
    public void init(){
        System.out.println("Application is up for student and running");
    }
}
