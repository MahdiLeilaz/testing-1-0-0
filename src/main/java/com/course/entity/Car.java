package com.course.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Car {
	private String brand;
	private String color;
	private String type;
	private int price;
	private boolean available;
	@JsonFormat(pattern = "dd-MMM-yyyy" ,timezone = "Asia/Tehran")
	private LocalDate firstReleaseDate;
	@JsonInclude(value = Include.NON_EMPTY)
	private List<String> additionalFeatures;
	@JsonUnwrapped
	private Engine engine;
	private List<Tier> tiers;
	
	public Car() {}
	
	public Car(String brand, String color, String type, int price, boolean available, LocalDate firstReleaseDate) {
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.price = price;
		this.available = available;
		this.firstReleaseDate = firstReleaseDate;
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public LocalDate getFirstReleaseDate() {
		return firstReleaseDate;
	}
	public void setFirstReleaseDate(LocalDate firstReleaseDate) {
		this.firstReleaseDate = firstReleaseDate;
	}
	public List<String> getAdditionalFeatures() {
		return additionalFeatures;
	}
	public void setAdditionalFeatures(List<String> additionalFeatures) {
		this.additionalFeatures = additionalFeatures;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public List<Tier> getTiers() {
		return tiers;
	}
	public void setTiers(List<Tier> tiers) {
		this.tiers = tiers;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", type=" + type + ", price=" + price + ", available="
				+ available + ", firstReleaseDate=" + firstReleaseDate + ", additionalFeatures=" + additionalFeatures
				+ ", engine=" + engine + ", tiers=" + tiers + "]";
	}
}
