package com.seneca.projecttracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin("*")
public class ProjecttrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjecttrackerApplication.class, args);
	}

}
