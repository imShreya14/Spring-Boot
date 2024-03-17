package com.myspring.telusko;

public interface Vehicle {
	public default void drive() {
		System.out.println("Vehicle running...");
	}
}
