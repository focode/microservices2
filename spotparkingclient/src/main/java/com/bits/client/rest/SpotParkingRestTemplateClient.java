package com.bits.client.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.bits.client.controller.MessageWrapper;
import com.bits.client.dto.ParkingSpot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SpotParkingRestTemplateClient {	
	
	@Autowired
    private RestTemplate restTemplate;

    public MessageWrapper<ParkingSpot> getParkingSpot(String pincode) {

    	ParkingSpot parkingSpot = restTemplate.exchange("http://spotparking/spotparking/{pincode}",HttpMethod.GET,null,new ParameterizedTypeReference<ParkingSpot>() {}, pincode).getBody();
        return new MessageWrapper<>(parkingSpot, "server called using eureka with rest template");

    }

}
