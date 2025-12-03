package com.example.app.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.app.entity.Employee;
import com.example.app.repository.EmpRepository;
@Service
public class EmpService {
	EmpRepository repository;
	public EmpService(EmpRepository repository){
		this.repository=repository;
	}
	
	public List<Employee> getEmpService() {
		// TODO Auto-generated method stub
		return repository.getEmpRepo();

	}
//	public String insertEmpService() {
//		// TODO Auto-generated method stub
//	return	repository.insertEmpRepo();
//		
//
//	}
	public void updateEmpService() {
		// TODO Auto-generated method stub
		repository.updateEmpRepo();
	}
	public String deleteEmpService(int index) {
		// TODO Auto-generated method stub
		return repository.deleteEmpRepo(index);

	}

}
