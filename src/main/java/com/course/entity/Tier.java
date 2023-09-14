package com.course.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Tier {
	private String manufacturer;
	@JsonProperty(value = "diameter")
	private int size;
	@JsonIgnore
	private int price;
	
	public Tier() {}
	
	public Tier(String manufacturer, int size, int price) {
		this.manufacturer = manufacturer;
		this.size = size;
		this.price = price;
	}

	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Tier [manufacturer=" + manufacturer + ", size=" + size + ", price=" + price + "]";
	}
}
