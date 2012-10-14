package com.danielsiwiec;

public class RunStrategies {
	
	public static void main(String[] args){
		Traveler walker = new Traveler(new WalkTravel());
		Traveler busCommuter = new Traveler(new BusTravel());
		Traveler carDriver = new Traveler(new CarTravel());
		
		System.out.println("Walker time: "+ walker.goTo(10));
		System.out.println("Bus time: "+ busCommuter.goTo(10));
		System.out.println("Car time: "+ carDriver.goTo(10));
	}

}
