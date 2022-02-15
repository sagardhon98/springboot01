package com.ci.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ci.entities.PhoneBook;

public interface PhoneBookRepo extends JpaRepository<PhoneBook, Long> {

}
