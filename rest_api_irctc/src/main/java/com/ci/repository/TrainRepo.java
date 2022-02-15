package com.ci.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ci.model.Train;

@Repository
public interface TrainRepo extends JpaRepository<Train, Long> {

}