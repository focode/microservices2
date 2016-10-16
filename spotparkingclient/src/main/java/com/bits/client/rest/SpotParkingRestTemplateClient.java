package com.bits.client.rest;

import java.util.List;

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

    public List<ParkingSpot> getParkingSpot(String pincode) {

    	List<ParkingSpot> parkingSpot = restTemplate.exchange("http://spotparking/spotparking/{pincode}",HttpMethod.GET,null,new ParameterizedTypeReference<List<ParkingSpot>>() {}, pincode).getBody();
        return parkingSpot;

    }

}
