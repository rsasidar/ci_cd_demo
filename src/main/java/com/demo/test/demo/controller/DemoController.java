package com.demo.test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {
	
	@GetMapping("/messages")
	public String retrieveCoursesForStudent() {
		return "Test Message......";
	}
	
	@GetMapping("/greeting")
	public String retrieveDetailsForCourse() {
		return "Greetings .... ";
	}	
	
	@GetMapping("/greeting/test/tests")
	public String retrieveDetailsForCourse() {
		return "Greetings .... ";
	}

}
