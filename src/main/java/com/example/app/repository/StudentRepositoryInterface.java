package com.example.app.repository;

import java.util.List;
import java.util.Map;

import org.jspecify.annotations.Nullable;

import com.example.app.entity.Student;

public interface StudentRepositoryInterface {

	List<Student> getAllStudents();
	String updateStudentEmail(int id, String email);
	String deleteStudent(int id);
	String insertStudent(String name, int age, String email, String dept);
	Student getStudent(int id);
	

}
