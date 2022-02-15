package com.ci.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ci.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	List<Employee> findByPlace(String place);

	Employee findByEmail(String email);

	List<Employee> findByDepartment(String department);

//	//customQuery jpql
//	@Query("select e from Employee e")
//	List<Employee> getAllEmployee();
//
//	//customQuery sql
//	@Query(value = "select * from Employee",nativeQuery=true)
//	List<Employee> getAllUser();
}
