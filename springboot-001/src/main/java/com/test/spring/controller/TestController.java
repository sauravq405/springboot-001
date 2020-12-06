package com.test.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.spring.beans.TestStudent;

@RestController
public class TestController {
	
	@GetMapping("/details")
	public TestStudent getStudentResponse() {	
		return new TestStudent(100, "Saurav", 98.2);
	}

}
