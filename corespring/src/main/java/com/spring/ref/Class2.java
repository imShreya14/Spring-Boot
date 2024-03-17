package com.spring.ref;

public class Class2 {

	private int b;
	private int c;
	public Class2(int b, int c) {
		super();
		this.b = b;
		this.c = c;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public Class2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Class2(int b) {
		super();
		this.b = b;
	}
	@Override
	public String toString() {
		return "Class2 [b=" + b + ", c=" + c + ", getC()=" + getC() + ", getB()=" + getB() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}

}
