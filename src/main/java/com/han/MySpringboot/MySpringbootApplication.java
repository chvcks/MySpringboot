package com.han.MySpringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MySpringbootApplication extends SpringBootServletInitializer {

	@RequestMapping("/")
	public String index() {
		return "Hello Spring boot";
	}
	
	@RequestMapping("/test")
	public String test() {
		return "Hello Spring boot test";
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MySpringbootApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(MySpringbootApplication.class, args);
	}

}
