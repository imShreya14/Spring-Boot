package com.spring.lifecycle;

public class Dell {

	private String name;
	private int id;
	private double price;
	public Dell(String name, int id, double price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Dell [name=" + name + ", id=" + id + ", price=" + price + "]";
	}
}
