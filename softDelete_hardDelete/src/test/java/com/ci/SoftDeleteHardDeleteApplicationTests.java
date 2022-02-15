package com.ci;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ci.dao.StudentRepo;
import com.ci.entity.Student;

@SpringBootTest
class SoftDeleteHardDeleteApplicationTests {

	@Autowired
	StudentRepo studentRepo;

	//insert data
	@Test
	public void testInsertStudent() {
		Student student = new Student("Vedant", "Panvel", "CS Engineering");
		Student save = studentRepo.save(student);
		System.out.println("Data insert Successfully.");
	}

	// hard delete
	@Test
	public void testHardDelete() {
		studentRepo.deleteById(2L);
		System.out.println("Data delete by id Successfully.");
	}

	// soft delete
	@Test
	public void testSoftDelete() {
		Long id = 4L;
		Student student = studentRepo.findById(id).get();
		System.out.println(student);
		student.setActive(true);
		studentRepo.save(student);
	}

	// get all data active true
	@Test
	public void testAllActiveTrue() {
		List<Student> activeTrue = studentRepo.findByActiveTrue();
		activeTrue.forEach(e -> {
			System.out.println(e);
		});
	}

}
