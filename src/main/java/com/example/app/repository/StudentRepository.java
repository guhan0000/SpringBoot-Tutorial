package com.example.app.repository;

import java.util.List;
import java.util.Map;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class StudentRepository implements StudentRepositoryInterface {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	final String SELECT="SELECT * FROM students";
	
//	READ
	@Override
	public List<Map<String, @Nullable Object>> getAllStudents() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList(SELECT);			
	}
	

}
