package com.ci.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ci.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
