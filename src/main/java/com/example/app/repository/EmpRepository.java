package com.example.app.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
@Repository
public class EmpRepository {
	
	static Map<String, Object> map;
	static {
		map=new HashMap<>();
		map.put("empId", 101);
		map.put("empName", "Guhan Muthuramalingam");
		map.put("empDept", "Dev");
		map.put("empEmail", "guhanm@mts.com");
	}
	
	
	public Map<String, Object> getEmpRepo() {
		// TODO Auto-generated method stub
		return map;

	}

}
