package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class EmpController {
	
	
	@GetMapping("/")
	public String getEmpData() {
		// TODO Auto-generated method stub
		return "Hello";

	}
	@PostMapping("/")
	private String insertEmpData() {
		// TODO Auto-generated method stub
		return "Data Inserted";

	}

}
