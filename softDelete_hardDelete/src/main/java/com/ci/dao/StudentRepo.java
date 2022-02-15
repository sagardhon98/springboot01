package com.ci.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ci.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {
	
	List<Student> findByActiveTrue();
}
