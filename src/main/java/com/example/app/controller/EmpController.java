package com.example.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.entity.Employee;
import com.example.app.service.EmpService;

@RestController
@RequestMapping("/emp")

public class EmpController {
	@Autowired
	EmpService service;

	@GetMapping("/getEmpData")
	private List<Employee> getEmpData() {
		// TODO Auto-generated method stub
		return service.getEmpService();
		

	}
	
//@PostMapping("/insertEmpData")
//	private String insertData() {
//		// TODO Auto-generated method stub
//		return service.insertEmpService();
//	}
@PutMapping("/updateEmpData")
	private void updateEmpData() {
		// TODO Auto-generated method stub
		service.updateEmpService();

	}

@DeleteMapping("/deleteEmpData/{index}")
	private String deleteEmpData(@PathVariable int index) {
		// TODO Auto-generated method stub
		return service.deleteEmpService(index);
	}

//Path Variable
@GetMapping("/getID/{id}")
	public String getIdString(@PathVariable long id) {
		return "Id is "+id;
	}

//Request Parameter
@GetMapping("/get")
public String name(@RequestParam String name,@RequestParam String role) {
	return name +" "+role;
}

@GetMapping("/salary")
public double salary(@RequestParam(name = "empSalary") double salary) {
	return salary;
}

}
