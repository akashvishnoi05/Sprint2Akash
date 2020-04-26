package com.capg.fms.service;

import java.util.List;

import com.capg.fms.entity.FlightBean;

public interface IFlightService {
	
	
	public FlightBean addFlight(FlightBean bean);
	
	public void deleteFlight(int flightNumber);
	
	public List<FlightBean> getAll();

}
