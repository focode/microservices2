package com.bits.org.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bits.org.entities.ParkingSpot;

public interface ParkingSpotRepository extends CrudRepository<ParkingSpot, Long>{
	
    void delete(ParkingSpot deleted);
    
    List<ParkingSpot> findAll();
 
    ParkingSpot findOne(Long id);
 
    ParkingSpot save(ParkingSpot persisted);

}
