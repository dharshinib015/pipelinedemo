package com.dockerexample.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
	@GetMapping("/docker")
	public String GetData() {
		return "Docker Integrated With Spring Boot";
	}
}
