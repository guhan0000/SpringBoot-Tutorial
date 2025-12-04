package com.example.app.service;

import java.util.List;
import java.util.Map;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.repository.StudentRepository;

@Service
public class StudentService implements StudentServiceInterface {
	@Autowired
	StudentServiceInterface repository;
	
	@Override
	public List<Map<String, @Nullable Object>> getAllStudents() {
		// TODO Auto-generated method stub
		return repository.getAllStudents();
	}

}
