package com.capg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Seat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seatId;
	
	private String seatNumber;
	
	private String seatLocation;

	private int seatFloor;

	private boolean isBooked;

	public Seat() {
		super();
	}

	public Seat(int seatId, String seatNumber, String seatLocation, int seatFloor, boolean isBooked) {
		super();
		this.seatId = seatId;
		this.seatNumber = seatNumber;
		this.seatLocation = seatLocation;
		this.seatFloor = seatFloor;
		this.isBooked = isBooked;
	}

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getSeatLocation() {
		return seatLocation;
	}

	public void setSeatLocation(String seatLocation) {
		this.seatLocation = seatLocation;
	}

	public int getSeatFloor() {
		return seatFloor;
	}

	public void setSeatFloor(int seatFloor) {
		this.seatFloor = seatFloor;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", seatNumber=" + seatNumber + ", seatLocation=" + seatLocation
				+ ", seatFloor=" + seatFloor + ", isBooked=" + isBooked + "]";
	}

}
