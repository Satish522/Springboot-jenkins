package com.satish.jenkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinsApplication.class, args);
	}
	
	@GetMapping("/welcom")
	public String welcome() {
		return "Hello , Welcome Satish to jenkins pipeline project";
	}

}
