package com.spring.consinj;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Bill bill;
	private List<String> phno;
	
	public Person(String name, int personId, Bill bill, List<String> phno) {
		super();
		this.name = name;
		this.personId = personId;
		this.bill = bill;
		this.phno = phno;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", bill=" + bill + ", phno=" + phno + "]";
	}
	
}
