package com.ci;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.ci.dao.EmployeeRepo;
import com.ci.entity.Employee;

@SpringBootTest
class PaginationPart1ApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	EmployeeRepo empRepo;
	
	//insert data
	@Test
	public void insertEmployee() {
		Employee employee = new Employee(8L, "Vedant", "vedant@gmail.com", "Koparkhairane", 23000.0);
		empRepo.save(employee);
		System.out.println("Data insert Successfully");
	}
	
	//pagination
	@Test
	public void testPagination() {
		int pageNo = 1;
		int pageSize = 4;
		
		PageRequest pageRequest = PageRequest.of(pageNo, pageSize);
		Page<Employee> findAll = empRepo.findAll(pageRequest);
		List<Employee> content = findAll.getContent();
		
		System.out.println(content);
		
		System.out.println(findAll);
	}

}
