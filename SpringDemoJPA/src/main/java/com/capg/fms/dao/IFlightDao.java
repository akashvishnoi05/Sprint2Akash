package com.capg.fms.dao;

import java.util.List;

import com.capg.fms.entity.FlightBean;

public interface IFlightDao {
	
    public FlightBean addFlight(FlightBean bean);
	
	public void deleteFlight(int flightNumber) ;
	
	public List<FlightBean> getAll();


}
