package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/")
	public String Welcome() {
		return "Welcome to the SHIELD";

	}

	@GetMapping("/avengers/assemble")
	public String avengers() {
		return "Avengers..... Assemble";
	}

	@GetMapping("/secret-bases")
	public String secret() {
		 return "<a href=\"https://www.wildcodeschool.com/\"> WildCodeSchool</a>";
	}
}
