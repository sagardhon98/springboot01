package com.ci.resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ci.exception.ResourceNotFoundException;
import com.ci.model.Employee;
import com.ci.repository.EmployeeRepo;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	/**
	 * Get All Employee
	 * */
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> fetchAllEmployee(Employee employee){
		List<Employee> findAllEmployee = employeeRepo.findAll();
		return new ResponseEntity<List<Employee>>(findAllEmployee, HttpStatus.ACCEPTED);
	}
	
	/**
	 * Save employee
	 * */
	@PostMapping("/employees")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		Employee saveEmployee = employeeRepo.save(employee);
		return new ResponseEntity<Employee>(saveEmployee, HttpStatus.CREATED);
	}
	
	/**
	 * Get single employee
	 * */
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id){
		Employee employee = employeeRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exit with id : " + id));
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
	
	
	/**
	 * Single employee update
	 * */
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateSingleEmployee(@PathVariable("id") Long id, @RequestBody Employee employee){	
		Employee emp = employeeRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not found with id : " + id));
		emp.setId(id);
		emp.setFirstName(employee.getFirstName());
		emp.setLastName(employee.getLastName());
		emp.setEmail(employee.getEmail());
		Employee updateEmployee = employeeRepo.save(emp);
		return new ResponseEntity<Employee>(updateEmployee, HttpStatus.ACCEPTED);
	}
	
	/**
	 * Single employee delete
	 * */
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable("id") Long id){
		Employee deleteEmployee = employeeRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not found with id : " + id));
		employeeRepo.delete(deleteEmployee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}