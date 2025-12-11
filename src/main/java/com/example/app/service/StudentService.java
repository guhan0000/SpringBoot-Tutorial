package com.example.app.service;


import java.util.List;
import java.util.Map;

import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.entity.Student;
import com.example.app.repository.StudentRepository;
import com.example.app.repository.StudentRepositoryInterface;


@Service
public class StudentService implements StudentServiceInterface {
//	private static final Logger logger=org.slf4j.LoggerFactory.getLogger(StudentService.class);
	@Autowired
	StudentRepositoryInterface repository;
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
//		logger.info("getAllStudents method called");
		return repository.getAllStudents();
	}
	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
//		logger.info("getStudent method called");
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
//		logger.warn("student with "+id+"is deleted");
		return repository.deleteStudent(id);

	}
	@Override
	public String insertStudent(String name,int age,String email,String dept) {
		// TODO Auto-generated method stub
		return repository.insertStudent(name, age, email, dept);

	}

}
