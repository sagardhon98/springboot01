package com.ci.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ci.entities.City;

@Repository
public interface CityRepo extends JpaRepository<City, Long> {

	List<City> findCityById(Long stateId);


}
