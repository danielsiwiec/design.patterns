package com.danielsiwiec;

public class CarTravel implements TravelStrategy{

	private static float speed = 10;

	@Override
	public float travelTime(int distance) {
		System.out.println("Traveling by car");
		return distance / speed;
	}

}
