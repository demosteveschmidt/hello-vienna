package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "\uD83D\uDCE6 Cloud Native Buildpacks and \uD83C\uDF31 Spring Boot at the CNCF Meetup \uD83C\uDDE6\uD83C\uDDF9 in Vienna!";
	}

}
