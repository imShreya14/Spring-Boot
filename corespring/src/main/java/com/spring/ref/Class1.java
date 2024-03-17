package com.spring.ref;

public class Class1 {
	private int a;
	
	private Class2 obj;
	
	public Class1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Class1(int a, Class2 obj) {
		super();
		this.a = a;
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Class1 [a=" + a + ", obj=" + obj + ", getA()=" + getA() + ", getObj()=" + getObj() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public Class2 getObj() {
		return obj;
	}

	public void setObj(Class2 obj) {
		this.obj = obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
