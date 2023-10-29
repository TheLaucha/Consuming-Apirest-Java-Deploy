package com.ideas.springboot.web.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "*")
@EnableJpaRepositories(basePackages = "com.ideas.springboot.web.app.service.dto.team")
@EntityScan(basePackages = "com.ideas.springboot.web.app.service.dto.team")
public class SpringBootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

}
