package com.ci.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ci.entities.Country;

@Repository
public interface CountryRepo extends JpaRepository<Country, Long> {

}
