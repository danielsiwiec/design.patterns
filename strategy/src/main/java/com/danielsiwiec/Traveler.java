package com.danielsiwiec;

public class Traveler {
	
	private TravelStrategy strategy;
	
	public Traveler(TravelStrategy strategy) {
		this.strategy = strategy;
	}

	public float goTo(int distance){
		return strategy.travelTime(distance);
	}

}
