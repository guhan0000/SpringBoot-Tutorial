package com.example.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmpController {
	
	
	@GetMapping("/getEmpData")
	public List<Integer> getEmpData() {
		List<Integer> list=new ArrayList<>();
		for(int i=10;i<=100;i+=10) {
			list.add(i);
		}
		return list;

	}
	@PostMapping("/")
	private String insertEmpData() {
		// TODO Auto-generated method stub
		return "Data Inserted";

	}

}
