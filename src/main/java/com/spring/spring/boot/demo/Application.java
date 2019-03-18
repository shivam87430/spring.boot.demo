package com.spring.spring.boot.demo;

import com.spring.spring.boot.demo.entity.Database;
import com.spring.spring.boot.demo.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	@Bean
	User user(){
		return new User("Shivam@abc.com","Shivam");
	}

	@Bean
	Database database(){
		return new Database();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
