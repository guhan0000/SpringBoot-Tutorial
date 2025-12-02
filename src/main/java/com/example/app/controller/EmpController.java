package com.example.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.service.EmpService;

@RestController

public class EmpController {
	@Autowired
	EmpService service;
	@GetMapping("/getEmpData")
	private Map<String, Object> getEmpData() {
		// TODO Auto-generated method stub
		return service.getEmpService();
		

	}
	
	
@PostMapping("/insertEmpData")
	private String insertData() {
		// TODO Auto-generated method stub
		return service.insertEmpService();
	}

}
