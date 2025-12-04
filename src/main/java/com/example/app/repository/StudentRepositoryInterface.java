package com.example.app.repository;

import java.util.List;
import java.util.Map;

import org.jspecify.annotations.Nullable;

public interface StudentRepositoryInterface {

	List<Map<String, @Nullable Object>> getAllStudents();
	String updateStudentEmail(int id, String email);
	

}
