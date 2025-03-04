package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinDemoApplication {
	
	@GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

	public static void main(String[] args) {
		SpringApplication.run(JenkinDemoApplication.class, args);
	}

}
