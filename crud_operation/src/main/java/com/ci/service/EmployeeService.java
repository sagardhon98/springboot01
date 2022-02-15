package com.ci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ci.dao.EmployeeRepo;
import com.ci.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	//insert data
	public Employee savedEmployee(Employee employee) {
		Employee emp = employeeRepo.save(employee);
		return emp;
	}
	
	
	//get data
	public List<Employee> getAllEmployee(){
		List<Employee> fetchAll = employeeRepo.findAll();
		return fetchAll;
	}


	public void deleteEmployeeById(Long id) {
		employeeRepo.deleteById(id);
	}

	//delete data
	


	 
	
}
