package com.danielsiwiec;

public class WalkTravel implements TravelStrategy {

	private static float speed = 1;

	@Override
	public float travelTime(int distance) {
		System.out.println("Traveling by foot");
		return distance / speed;
	}

}
