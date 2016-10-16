package com.bits.org.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bits.org.entities.ParkingSpot;

@RestController
public class SpotParkingController {
	
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

}
