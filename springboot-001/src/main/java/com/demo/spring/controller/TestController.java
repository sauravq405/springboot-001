package com.demo.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.beans.TestStudent;
import com.demo.spring.repository.TestStudentRepository;

@RestController
public class TestController {
	
	@Autowired
	private TestStudentRepository repository;
	
	@GetMapping("/details/{id}")
	public ResponseEntity<TestStudent> getStudentResponse(@PathVariable("id") int id) {	
		TestStudent student = repository.findByStudId(id);
		return ResponseEntity.ok(student);
	}

}
