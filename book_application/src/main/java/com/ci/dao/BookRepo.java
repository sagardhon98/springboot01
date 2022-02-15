package com.ci.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ci.entities.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {

}
