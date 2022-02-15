package com.ci.dao;

import org.springframework.data.repository.CrudRepository;

import com.ci.entity.Teacher;

public interface TeacherDao extends CrudRepository<Teacher, Long> {

	
}
