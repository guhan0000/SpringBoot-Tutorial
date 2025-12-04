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
	final String UPDATE="UPDATE students SET email=? WHERE student_id=?";
	final String DELETE="DELETE FROM students WHERE student_id=?";
	final String INSERT="INSERT INTO students (name,age,email,department) VALUES (?,?,?,?)";
	
	
//	READ
	@Override
	public List<Map<String, @Nullable Object>> getAllStudents() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList(SELECT);			
	}
//	UPDATE
	@Override
	public String updateStudentEmail(int id,String email) {
		// TODO Auto-generated method stub
		
		int update2 = jdbcTemplate.update(UPDATE,email,id);
		if(update2==1) {
			return "email updated";
		}
		else {
			return "email not updated";
		}

	}
	@Override
	public String deleteStudent(int id) {
		// TODO Auto-generated method stub
		 int update2 = jdbcTemplate.update(DELETE,id);
		 if(update2==1) {
			 return "Student Deleted";
		 }
		 else {
			 return "Student not Deleted";
		 }

	}
	@Override
	public String insertStudent(String name,int age,String email,String dept) {
		// TODO Auto-generated method stubjd
		Object arr[]= {name,age,email,dept};
		int update2 = jdbcTemplate.update(INSERT,arr);
		if (update2==1) {
			return "Student "+name+" Inserted";
		}
		else {
			return "Student not Inserted";
		}
		

	}
	
	
	
	

}
