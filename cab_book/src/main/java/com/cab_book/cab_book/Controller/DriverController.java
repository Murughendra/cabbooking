package com.cab_book.cab_book.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cab_book.cab_book.Model.Driver;
import com.cab_book.cab_book.Repository.DriverRepo;

@RestController
public class DriverController {
	
	@Autowired
	private DriverRepo driverRepo;
	
	
	@GetMapping("/driver")
	private ResponseEntity<List<Driver>> getDriver(){
		List<Driver> driverList = new ArrayList<>();
		driverRepo.findAll().forEach(driverList::add);
		if(driverList.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			
		}
		return new ResponseEntity<>(driverList, HttpStatus.OK);
		
	}
	
	@PostMapping("/adddriver")
	public ResponseEntity<Driver> add_driver(@RequestBody Driver driver){
		Driver driverobj = driverRepo.save(driver);
		
		return new ResponseEntity<>(driverobj,HttpStatus.OK);
	}

	
	@GetMapping("/getride")
	private ResponseEntity<List<Driver>> getRide(@RequestParam("source") List Source, @RequestParam("dest") List Dest){
		List<Driver> allDriver = driverRepo.findAll();
		List<Driver> avaliDriver = new A
	}
}
