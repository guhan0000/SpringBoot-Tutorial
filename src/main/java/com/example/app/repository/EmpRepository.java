package com.example.app.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.app.entity.Employee;
import com.example.app.entity.EmployeeRowMapper;
@Repository
public class EmpRepository {
	
	final String SELECT="SELECT * FROM employees";
	@Autowired
	EmployeeRowMapper rowMapper;
	@Autowired
	JdbcTemplate jdbcTemplate;
//	static int index;
	static List<Employee> list;
	static {
		list=new ArrayList<>();
		Employee employee1=new Employee();
		employee1.setEmpId(101);
		employee1.setEmpName("Guhan M");
		employee1.setEmpDept("Product");
		employee1.setEmpCity("Coimbatore");
		list.add(employee1);
		Employee employee2=new Employee();
		employee2.setEmpId(102);
		employee2.setEmpName("Naresh G");
		employee2.setEmpDept("Production");
		employee2.setEmpCity("Coimbatore");
		list.add(employee2);
//		index=0;
		
	}
//	CREATE
	private void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		list.add(emp);
		

	}
//	READ
	
	public List<Employee> getEmpRepo() {
		// TODO Auto-generated method stub
		
		return jdbcTemplate.query(SELECT, rowMapper);

	}
//	public String insertEmpRepo() {
//		// TODO Auto-generated method stub
//		map.put("empSalary", 36025);
//		return "EmpData Inserted";
//
//	}
	public void updateEmpRepo() {
		// TODO Auto-generated method stub
		Employee employee = list.get(1);
		employee.setEmpCity("Bengaluru");
	}
	public String deleteEmpRepo(int index) {
		if(list.size()>index && index>=0) {
			list.remove(index);
			return "Employee Removed";
		}
		return "Employee not Removed";
	
		
			
	}

}
