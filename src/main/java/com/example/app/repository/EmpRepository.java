package com.example.app.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.app.entity.Employee;
@Repository
public class EmpRepository {
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
	
	
	public List<Employee> getEmpRepo() {
		// TODO Auto-generated method stub
		return list;

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
