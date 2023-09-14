package com.course.entity;

public class Engine {
	private String fuelType;
	private int horsepower;
	
	public Engine() {}

	public Engine(String fuelType, int horsepower) {
		this.fuelType = fuelType;
		this.horsepower = horsepower;
	}

	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	@Override
	public String toString() {
		return "Engine [fuelType=" + fuelType + ", horsepower=" + horsepower + "]";
	}	
}
