package com.demo.test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/v2")
public class DemoController {
	
	@GetMapping("/messages")
	public String retrieveCoursesForStudent() {
		var test1 = 20;
		var test2 = 30;
		var test3 = 20;
		var test4 = 30;
		if(test1 ==20 && test2 == 30 && test3 == 20 && test4 == 30) {
		    System.out.println("Test = " + test2)
		} else if(test1 ==20 && test2 == 30 && test3 == 20 && test4 == 30) {
			
		} else if(test1 ==20 && test2 == 30 && test3 == 20 && test4 == 30) {
			
		} else if(test1 ==20 && test2 == 30 && test3 == 20 && test4 == 30) {
			
		} else if(test1 ==20 && test2 == 30 && test3 == 20 && test4 == 30) {
			
		}
			
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
