package com.ci.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ci.model.Train;
import com.ci.service.TrainService;

@RestController
@RequestMapping("/train")
public class TrainController {

	@Autowired
	private TrainService trainService;

	/**
	 * Insert Train
	 */
	@PostMapping("/save")
	public Train insertTrain(@RequestBody Train train) {
		return trainService.saveTrain(train);
	}

	/**
	 * Read All Train
	 */
	@GetMapping("/get")
	public List<Train> readAllTrain() {
		return trainService.getAllTrains();
	}

	/**
	 * Single Train Get
	 */
	@GetMapping("/get/{id}")
	public Train getSingle(@PathVariable("id") Long id) {
		return trainService.getSingleTrain(id);
	}

	/**
	 * Delete Single Train
	 */
	@DeleteMapping("/delete/{id}")
	public boolean singleTrainDelete(@PathVariable("id") Long id) {
		return trainService.deleteSingleTrain(id);
	}

	/**
	 * find by source and destination name
	 * */
	@GetMapping("/search")
	public String getBySourceAndDestination(@RequestParam(value="source" , required=false) String source , @RequestParam(value="destination" , required=false) String destination) {
		return source + " : "+ destination;
	}
	
	/**
	 * find by Train Name
	 * */
	@GetMapping("/trainName")
	public String getByTrainName(@RequestParam(value="train_name" , required=false) String train_name) {
		return "Train Name is : " + train_name;
	}
	
	/**
	 * find by Train Number
	 * */
	@GetMapping("/trainNo")
	public String getByTrainNumber(@RequestParam(value="train_number" , required=false) String train_number) {
		return "Train Number is : " + train_number;
	}
	

}
