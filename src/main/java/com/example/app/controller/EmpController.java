package com.example.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmpController {
	List<Integer> list;
	
	@GetMapping("/getEmpData")
	public List<Integer> getEmpData() {
		list=new ArrayList<>();
		for(int i=10;i<=100;i+=10) {
			list.add(i);
		}
		return list;

	}
	@GetMapping("/getData")
	private List<Integer> insertEmpData() {
		// TODO Auto-generated method stub
		return list;

	}
	@PostMapping("/insertData")
	private String insertData() {
		// TODO Auto-generated method stub
		return "Data inserted";
	}

}
