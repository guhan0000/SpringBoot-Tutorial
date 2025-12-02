package com.example.app.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.app.repository.EmpRepository;
@Service
public class EmpService {
	EmpRepository repository;
	public EmpService(EmpRepository repository){
		this.repository=repository;
	}
	
	public Map<String, Object> getEmpService() {
		// TODO Auto-generated method stub
		return repository.getEmpRepo();

	}
	public String insertEmpService() {
		// TODO Auto-generated method stub
	return	repository.insertEmpRepo();
		

	}

}
