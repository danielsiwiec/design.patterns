package com.danielsiwiec;

public class BusTravel implements TravelStrategy {

	private static float speed = 5;

	@Override
	public float travelTime(int distance) {
		System.out.println("Traveling by bus");
		return distance / speed;
	}

}
