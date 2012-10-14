package com.danielsiwiec;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarBuilderTest {
	
	@Test
	public void buildsCar(){
		Car car = new Car.Builder().withBrand("GM").withEngineDisplacement(2).withHorsePower(120).withModelYear(2012).build();
		assertEquals("GM",car.getBrand());
		assertEquals(2,car.getEngineDisplacement(),0.01);
		assertEquals(120,car.getHorsePower());
		assertEquals(2012,car.getModelYear());
	}
}
