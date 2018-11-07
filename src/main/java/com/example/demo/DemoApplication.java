package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	@RequestMapping("/")
    public String index() {
        return "No humans were involved in creation of this page v1.0";
    }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	

}
