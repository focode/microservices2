package com.bits.org.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ParkingSpot {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long Id;
	private String ownerName;// user id , this will be unique across users
	private String pincode;
	private String houseNo;
	private String streetName;
	private String areaName;
	private String city;
	private String state;
	private String mobile;
	
	public ParkingSpot() {
		// TODO Auto-generated constructor stub
	}
	
	public ParkingSpot(String ownerName,String pincode,String houseNo, String streetName
    ,String areaName,
	String city,
	String state,
	String mobile) {
		this.ownerName = ownerName;
		this.pincode = pincode;
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.areaName = areaName;
		this.city = city;
		this.state = state;
		this.mobile = mobile;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	

}
