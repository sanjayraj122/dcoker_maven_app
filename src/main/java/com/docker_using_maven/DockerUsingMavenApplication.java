package com.docker_using_maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerUsingMavenApplication {

	@GetMapping("maven")
	public String getDeatils(String str){
		return "maven implementation";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerUsingMavenApplication.class, args);
	}

}
