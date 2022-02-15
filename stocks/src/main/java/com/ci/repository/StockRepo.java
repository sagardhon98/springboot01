package com.ci.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ci.model.Stock;

@Repository
public interface StockRepo extends JpaRepository<Stock, Long> {

}
