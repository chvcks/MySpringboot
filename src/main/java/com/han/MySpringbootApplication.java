package com.han;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.han.config.ConfigBean;

@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class})
public class MySpringbootApplication extends SpringBootServletInitializer {

		
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MySpringbootApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(MySpringbootApplication.class, args);
	}

}
