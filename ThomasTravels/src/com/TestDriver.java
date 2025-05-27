package com;

import java.util.Arrays;

public class TestDriver {

	public static void main(String[] args) {
		System.out.println("TestDriver");
		
		Driver driver1 = new Driver("Car", 1, "Giri", 2000);
		Driver driver2 = new Driver("Lorry", 2, "Ramu", 2500);
		Driver driver3 = new Driver("Auto", 3, "Vinay", 1500);
		
		Driver[] driv = {driver1,driver2,driver3};
		Travels travels = new Travels(driv)
				;
		Travels travels1 = new Travels();
		System.out.println("Is car Driver : "+travels1.isCarDriver(driver3));
		System.out.println("Retrive by Id : "+travels1.retrivebyDriverId(driv, 2));
		System.out.println("Retrieve driver : "+Arrays.toString(travels1.retriveDriver(driv, "Car")));
		System.out.println("Count of driver : "+travels1.retriveCountOfDriver(driv,"Car"));
		System.out.println("Maximum distance travelled Driver : "+travels1.retrieveMaximumDistanceTravelledDriver(driv));
		
	}

}
