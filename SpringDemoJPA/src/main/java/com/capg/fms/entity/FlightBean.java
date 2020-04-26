package com.capg.fms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Flight_Spring")
public class FlightBean {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int flightNumber;
	
	private String flightModel;
	private String carrierName;
	private int seatCapacity;
	
	@Override
	public String toString() {
		return "FlightBean [flightNumber=" + flightNumber + ", flightModel=" + flightModel + ", carrierName="
				+ carrierName + ", seatCapacity=" + seatCapacity + "]";
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightModel() {
		return flightModel;
	}
	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	public int getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	
}
