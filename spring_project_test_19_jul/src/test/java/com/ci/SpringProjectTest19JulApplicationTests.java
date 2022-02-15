package com.ci;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ci.dao.TeacherDao;
import com.ci.entity.Teacher;

@SpringBootTest
class SpringProjectTest19JulApplicationTests {

//	@Test
//	void contextLoads() {
//	}

	@Autowired
	TeacherDao teacherDao;

	// insert data
	@Test
	public void saveTeacher() {
		Teacher teacher = new Teacher(4L, "Yash", "yash@gmail.com");
		teacherDao.save(teacher);
		System.out.println("Data insert Successfully");
	}

	// update data
	@Test
	public void updateTeacher() {
		Teacher teacher = new Teacher(3L, "Sagar", "sagardhon@gmail.com");
		teacherDao.save(teacher);
		System.out.println("Data update Successfully");
	}

	// fetch single data
	@Test
	public void fetchSingle() {
		Optional<Teacher> teacher = teacherDao.findById(2L);
		System.out.println("Single data fetch Successfully " + teacher);
	}

	// fetch all data
	@Test
	public void fetchAll() {
		Iterable<Teacher> teacher = teacherDao.findAll();
		System.out.println("All data fetch Successfully " + teacher);
	}

	// delete single data
	@Test
	public void deleteSingle() {
		teacherDao.deleteById(2L);
		System.out.println("Single data delete Successfully");
	}

	// all data delete
	@Test
	public void deleteAll() {
		teacherDao.deleteAll();
		System.out.println("All data delete Successfully");
	}
	
	//count data
	@Test
	public void countTeacher() {
		long teacher = teacherDao.count();
		System.out.println("Total available data is : "+teacher);
	}

}
