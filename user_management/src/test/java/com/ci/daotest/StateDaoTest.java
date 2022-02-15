package com.ci.daotest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ci.entities.State;
import com.ci.repository.StateRepo;

@SpringBootTest
class StateDaoTest {

	@Autowired
	private StateRepo stateRepo;

	/**
	 * Test Cases for State
	 */
	
	@Test
	public void testGetStateByCountryId() {
		Long countryId = 1L;
		List<State> findStateByCountryId = stateRepo.findStateByCountryId(countryId);
		System.out.println(findStateByCountryId);
	}	

	// Insert State
	@Test
	public void testInsertState() {
		State state = new State(1L, "Maharashtra", 1L);
		State insertState = stateRepo.save(state);
		System.out.println("Data saved Successfully." + insertState);
	}

	// Update State
	@Test
	public void testUpdateState() {
		State state = new State(1L, "Maharashtra", 1L);
		State updateSate = stateRepo.save(state);
		System.out.println("Data update Successfully." + updateSate);
	}

	// single State fetch
	@Test
	public void testReadSingleState() {
		Long id = 1L;
		Optional<State> readSingleState = stateRepo.findById(id);
		System.out.println("Single Data fetch Successfully." + readSingleState.get());
		
		assertNotNull(readSingleState);
	}

	// Read All State
	@Test
	public void testReadState() {
		List<State> readAllState = stateRepo.findAll();
		System.out.println("All data fetch Successfully.");
		readAllState.forEach(e -> {
			System.out.println(e);
		});
		
		assertNotNull(readAllState);
	}

	// Single Data Delete
	@Test
	public void testDeleteSingleState() {
		Long id = 1L;
		stateRepo.deleteById(id);
		System.out.println("single data delete Successfully.");
	}

	// Delete All State
	@Test
	public void testDeleteAllState() {
		stateRepo.deleteAll();
		System.out.println("All data delete Successfully");
	}

}
