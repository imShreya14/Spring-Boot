package com.myspring.telusko;

import org.springframework.stereotype.Component;

@Component
public class Tyre {

	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "It is working";
	}

	public Tyre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tyre(String brand) {
		super();
		this.brand = brand;
	}
}
