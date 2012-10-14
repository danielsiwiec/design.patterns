package com.danielsiwiec;

public class Car {

	private String brand;
	private int modelYear;
	private float engineDisplacement;
	private int horsePower;
	
	private Car(Builder builder){
		brand = builder.brand;
		modelYear = builder.modelYear;
		engineDisplacement = builder.engineDisplacement;
		horsePower = builder.horsePower;
	}

	public String getBrand() {
		return brand;
	}

	public int getModelYear() {
		return modelYear;
	}

	public float getEngineDisplacement() {
		return engineDisplacement;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public static class Builder {
		private String brand;
		private int modelYear;
		private float engineDisplacement;
		private int horsePower;

		public Builder withBrand(String brand) {
			this.brand = brand;
			return this;
		}

		public Builder withModelYear(int modelYear) {
			this.modelYear = modelYear;
			return this;
		}

		public Builder withEngineDisplacement(float engineDisplacement) {
			this.engineDisplacement = engineDisplacement;
			return this;
		}

		public Builder withHorsePower(int horsePower) {
			this.horsePower = horsePower;
			return this;
		}
		
		public Car build(){
			return new Car(this);
		}
	}
}
