package com.myspring.myproject1;

import java.util.List;
import java.util.Map;

public class Course {
	List<Student> student;	//student list
	Map<String, Integer> fees;	//teacher and their fees

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(List<Student> student, Map<String, Integer> fees) {
		super();
		this.student = student;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course [student=" + student + "\nfees=" + fees + "]";
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public Map<String, Integer> getFees() {
		return fees;
	}
	public void setFees(Map<String, Integer> fees) {
		this.fees = fees;
	}
}
