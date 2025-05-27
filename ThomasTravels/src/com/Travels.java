package com;

import java.util.Arrays;
import java.util.ArrayList;

public class Travels {
	
	Driver[] drivers;
	
	public Travels() {
		
	}
	public Travels(Driver[] drivers) {
		this.drivers = drivers;
	}
	
	
	
	public boolean isCarDriver(Driver driver) {
		
		System.out.println(driver.getCategory());
		return driver.getCategory().equals("Car") ;
		
	}
	
	public String retrivebyDriverId(Driver[] drivers,int id) {
		
		for(int i =0 ; i <drivers.length ; i++) {
			if(drivers[i].getDriverId() == id) {
				return "Driver name is "+drivers[i].getDriverName()+" belonging to the category of "+drivers[i].getCategory()+" traveled  "+drivers[i].getTotalDistance()+" KM so far.";
			} 
		}
		return null;
		
	}
	
	public int retriveCountOfDriver(Driver[] drivers,String category) {
		int count =0;
		for(int i =0 ; i <drivers.length ; i++) {
			if(drivers[i].getCategory() == category) {
				count ++;
			}
		}
		return count;
		
	}
	
	public String[] retriveDriver(Driver[] drivers, String category) {
		int count = retriveCountOfDriver(drivers, category);
		String[] result = new String[count];
		int i = 0;
		for(Driver driver : drivers) {
			if(driver.getCategory().equalsIgnoreCase(category)) {
				result[i] = driver.getDriverName();
			}
		}
		return result;
	}
	
	public String retrieveMaximumDistanceTravelledDriver(Driver[] drivers) {
		double max = 0;
		int index=0;
		for (int i = 0; i < drivers.length ; i++) {
			if(drivers[i].getTotalDistance() > max) {
				max = drivers[i].getTotalDistance();
				index = i;
			}
		}
		return drivers[index].getDriverName();
	}
	
	
}
