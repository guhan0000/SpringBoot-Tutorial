package com.example.app.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		employee.setEmpId(rs.getInt(1));
		employee.setEmpName(rs.getString("name"));
		employee.setEmpDept(rs.getString("department"));
		employee.setEmpCity(rs.getString("city"));
		return employee;
	}
	
	

}
