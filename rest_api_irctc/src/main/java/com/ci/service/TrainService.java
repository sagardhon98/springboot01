package com.ci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ci.model.Train;
import com.ci.repository.TrainRepo;

@Service
public class TrainService {

	@Autowired
	private TrainRepo trainRepo;

	/**
	 * Save Train Detail's
	 */

	public Train saveTrain(Train train) {
		return trainRepo.save(train);
	}

	/**
	 * Get all Train Detail's
	 */
	public List<Train> getAllTrains() {
		return trainRepo.findAll();
	}

	/**
	 * Get single Train Detail's
	 */
	public Train getSingleTrain(Long id) {
		return trainRepo.findById(id).get();
	}

	/**
	 * Delete single Train Detail's
	 */
	public boolean deleteSingleTrain(Long id) {
		boolean existsById = trainRepo.existsById(id);

		if (existsById) {
			trainRepo.deleteById(id);
		}
		return existsById;
	}
}
