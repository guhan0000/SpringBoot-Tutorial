package com.example.app.controller;

import java.util.List;
import java.util.Map;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.entity.Student;
import com.example.app.service.StudentService;
import com.example.app.service.StudentServiceInterface;

@RestController
public class StudentController {
	int id=11;
	String email="guhan@outlook.com";
	@Autowired
	StudentServiceInterface service;
	
	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return service.getAllStudents();
		}
	@GetMapping("/getStudent/{id}")
	public Student getStudent(@PathVariable int id)
	{
		return service.getStudent(id);
	}
	@PutMapping("/updateStudentEmail")
	public String updateStudentEmail() {
		// TODO Auto-generated method stub
		
		return service.updateStudentEmail(id,email);

	}
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int id) {
		// TODO Auto-generated method stub
		return service.deleteStudent(id);
		

	}
	@PostMapping("/insert")
	public String insertStudent() {
		return service.insertStudent("Arthur Morgan", 20, "arthurm@gmail.com", "Mechanical");
	}
	

}
