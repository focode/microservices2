package com.bits.org.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bits.org.entities.ParkingSpot;
import com.bits.org.repository.ParkingSpotRepository;

@RestController
public class SpotParkingController {
	@Autowired
	ParkingSpotRepository parkingSpotRepository;
	
	 @RequestMapping("/spotparking/{pincode}")
	    public List<ParkingSpot> fetchParkingSpots(@RequestParam(value="pincode", defaultValue="pincode") String pincod) {
		 List<ParkingSpot> listOfParkingSpot = new ArrayList<ParkingSpot>();
		 ParkingSpot parkingSpot = new ParkingSpot();
		 parkingSpot.setAreaName("areaName1");
		 parkingSpot.setCity("city1");
		 parkingSpot.setHouseNo("houseNo1");
		 parkingSpot.setMobile("mobile1");
		 parkingSpot.setOwnerName("ownerName1");
		 parkingSpot.setPincode("pincode1");
		 parkingSpot.setState("state1");
		 parkingSpot.setStreetName("streetName1");
		
		 listOfParkingSpot.add(parkingSpot);		 
		 return listOfParkingSpot;
	    }
	 
	 @RequestMapping(value = "/spotparking/register",method = RequestMethod.POST)
	 public ParkingSpot registerParkingSpots(@RequestBody ParkingSpot parkingSpot) {
		 parkingSpotRepository.save(parkingSpot);
		return parkingSpot;
		 
	 }
	 
	 @RequestMapping(value = "/spotparking/fetch",method = RequestMethod.GET)
	 public List<ParkingSpot> registerParkingSpots() {
		 List<ParkingSpot> listOfObjects = new ArrayList<ParkingSpot>();
		 listOfObjects = parkingSpotRepository.findAll();
		return listOfObjects;
		 
	 }
	 
	 @RequestMapping(value = "/spotparking/fetch/pincode/{pincode}",method = RequestMethod.GET)
	 public List<ParkingSpot> fetchParkingByPincode(@RequestParam(value="pincode", defaultValue="pincode")String pincode) {
		 List<ParkingSpot> listOfObjects = new ArrayList<ParkingSpot>();
		 listOfObjects = parkingSpotRepository.findAll();
		return listOfObjects;
		 
	 }
	 
	 
	 
	 
	 

}
