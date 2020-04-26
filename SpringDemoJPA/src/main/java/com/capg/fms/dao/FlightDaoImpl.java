package com.capg.fms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.capg.fms.entity.FlightBean;

@Repository
@Transactional
public class FlightDaoImpl implements IFlightDao {
	
	
	@PersistenceContext
	EntityManager entitymanager;

	@Override
	public FlightBean addFlight(FlightBean bean) {
		// TODO Auto-generated method stub
		entitymanager.persist(bean);
		 
		 return bean;
		
	}

	@Override
	public void deleteFlight(int flightNumber) {
		// TODO Auto-generated method stub
		
	FlightBean b =	entitymanager.find(FlightBean.class,flightNumber);
	 entitymanager.remove(b);
	
		
	}

	@Override
	public List<FlightBean> getAll() {
		// TODO Auto-generated method stub
		TypedQuery<FlightBean> query = entitymanager.createQuery("from FlightBean Table", FlightBean.class);
		return query.getResultList();
	
	}

}
