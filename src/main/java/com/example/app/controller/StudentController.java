package com.example.app.controller;

import java.util.List;
import java.util.Map;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.service.StudentService;
import com.example.app.service.StudentServiceInterface;

@RestController
public class StudentController {
	@Autowired
	StudentServiceInterface service;
	
	@GetMapping("/getAllStudents")
	public List<Map<String, @Nullable Object>> getAllStudents() {
		// TODO Auto-generated method stub
		return service.getAllStudents();
		

	}
	
	

}
