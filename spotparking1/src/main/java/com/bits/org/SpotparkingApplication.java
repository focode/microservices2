package com.bits.org;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.bits.org.entities.ParkingSpot;
import com.bits.org.repository.ParkingSpotRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@EnableEurekaClient
public class SpotparkingApplication {
	
	private static final Logger log = LoggerFactory.getLogger(SpotparkingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpotparkingApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ParkingSpotRepository repository) {
		return (args) -> {
			
	repository.save(new ParkingSpot("ownerName1","pincode1","houseNo1","streetName1"
				    ,"areaName1","city1","state1","9999999999"));

	repository.save(new ParkingSpot("ownerName2","pincode2","houseNo2","streetName2"
				    ,"areaName1","city1","state2","8888888888"));

	repository.save(new ParkingSpot("ownerName3","pincode3","houseNo3","streetName3"
				    ,"areaName3","city3","state3","7777777777"));

	repository.save(new ParkingSpot("ownerName4","pincode4","houseNo4","streetName4"
				    ,"areaName4","city4","state4","6666666666"));

	repository.save(new ParkingSpot("ownerName5","pincode5","houseNo5","streetName5"
				    ,"areaName5","city5","state5","5555555555"));

	repository.save(new ParkingSpot("ownerName6","pincode6","houseNo6","streetName6"
				    ,"areaName6","city6","state6","4444444444"));

	repository.save(new ParkingSpot("ownerName7","pincode7","houseNo7","streetName7"
				    ,"areaName7","city7","state7","mobile7"));
	
			
		};
	}
}
