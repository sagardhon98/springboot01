package com.ci.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ci.entities.State;

@Repository
public interface StateRepo extends JpaRepository<State, Long> {

	List<State> findStateById(Long countryId);
	
	List<State> findStateByCountryId(Long countryId);
}
