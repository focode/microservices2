package com.bits.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bits.client.rest.SpotParkingRestTemplateClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class SpotParkingClientController {
	
	
	 @Autowired
	 private SpotParkingRestTemplateClient spotParkingRestTemplateClient;
	
	private static Logger logger = LoggerFactory.getLogger(SpotParkingClientController.class);
	
    @RequestMapping(value = "/spotparkingclient/{pincode}", method = RequestMethod.GET, produces = "application/json")
    public MessageWrapper getCustomer(@PathVariable String pincode) {
    logger.debug("Reading spotparking using rest template client with ID " + pincode);
    return spotParkingRestTemplateClient.getParkingSpot(pincode);

    }

}
