package com.example.app.service;

import java.util.List;
import java.util.Map;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.entity.Student;
import com.example.app.repository.StudentRepository;
import com.example.app.repository.StudentRepositoryInterface;

@Service
public class StudentService implements StudentServiceInterface {
	@Autowired
	StudentRepositoryInterface repository;
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repository.getAllStudents();
	}
	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return repository.getStudent(id);

	}
	@Override
	public String updateStudentEmail(int id, String email) {
		// TODO Auto-generated method stub
		
		return repository.updateStudentEmail( id, email);

	}
	@Override
	public String deleteStudent(int id) {
		// TODO Auto-generated method stub
		return repository.deleteStudent(id);

	}
	@Override
	public String insertStudent(String name,int age,String email,String dept) {
		// TODO Auto-generated method stub
		return repository.insertStudent(name, age, email, dept);

	}

}
