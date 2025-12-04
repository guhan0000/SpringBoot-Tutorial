package com.example.app.service;

import java.util.List;
import java.util.Map;

import org.jspecify.annotations.Nullable;

public interface StudentServiceInterface {

	List<Map<String, @Nullable Object>> getAllStudents();

	String updateStudentEmail(int id, String email);

	String deleteStudent(int id);

}
