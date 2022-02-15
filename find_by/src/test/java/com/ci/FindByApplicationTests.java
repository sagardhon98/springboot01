package com.ci;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;

import com.ci.dao.EmployeeRepo;
import com.ci.entity.Employee;

@SpringBootTest
class FindByApplicationTests {

//	@Test
//	void contextLoads() {
//	}

	@Autowired
	EmployeeRepo employeeRepo;

	// filter
	@Test
	public void testFilter() {
		Employee employee = new Employee();
		//employee.setSalary(40000);
		Example<Employee> exampleEmployee = Example.of(employee);
		List<Employee> findAll = employeeRepo.findAll(exampleEmployee);
		System.out.println(findAll);
	}

//	//custom query
//	@Test
//	public void testGetAllEmployee() {
//		List<Employee> getAll = employeeRepo.getAllEmployee();
//		getAll.forEach(e->{
//			System.out.println(e);
//		});
//	}
//	
//	@Test
//	public void testGetAllUserSalary() {
//		List<Employee> getAllUserSalary = employeeRepo.getAllUser();
//		getAllUserSalary.forEach(e->{
//			System.out.println(e);
//		});
//	}

	// data insert
	@Test
	public void testSaveEmployee() {
		Employee employee = new Employee(4L, "Gunwanta", "gunwanta@gmail", "Ghansoli", "Full-stack Developer", 40000);
		employeeRepo.save(employee);
		System.out.println("Data Insert Successfully");
	}

	// data fetch by place
	@Test
	public void testFindByPlace() {
		List<Employee> place = employeeRepo.findByPlace("Thane");
		System.out.println("Data fetch by place Successfully " + place);
	}

	// data fetch by email
	@Test
	public void testFindByEmail() {
		Employee empEmail = employeeRepo.findByEmail("ram@gmail.com");
		System.out.println("Data fetch by email successfully " + empEmail);
	}

	// data fetch by department
	@Test
	public void testFindByDepartment() {
		List<Employee> empDepartment = employeeRepo.findByDepartment("Full-slack Developer");
		System.out.println("Data fetch by department Successfully " + empDepartment);
	}
}
