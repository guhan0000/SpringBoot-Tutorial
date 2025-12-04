package com.example.app.controller;

import java.util.List;
import java.util.Map;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.service.StudentService;
import com.example.app.service.StudentServiceInterface;

@RestController
public class StudentController {
	int id=11;
	String email="guhan@outlook.com";
	@Autowired
	StudentServiceInterface service;
	
	@GetMapping("/getAllStudents")
	public List<Map<String, @Nullable Object>> getAllStudents() {
		// TODO Auto-generated method stub
		return service.getAllStudents();
		}
	@PutMapping("/updateStudentEmail")
	public String updateStudentEmail() {
		// TODO Auto-generated method stub
		
		return service.updateStudentEmail(id,email);

	}
	@DeleteMapping("/deleteStudent")
	public String deleteStudent() {
		// TODO Auto-generated method stub
		return service.deleteStudent(2);

	}
	

}
