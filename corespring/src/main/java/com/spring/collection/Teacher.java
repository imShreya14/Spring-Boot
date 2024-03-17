package com.spring.collection;

import java.util.*;

public class Teacher {

	
//Collection types
		private List<String> phones ;
		private Set<String> office;
		private Map<String, String> courses;
		
		@Override
		public String toString() {
			return "Teacher [phones=" + phones + ", office=" + office + ", courses=" + courses + "]";
		}
		public List<String> getPhones() {
			return phones;
		}
		public void setPhones(List<String> phones) {
			this.phones = phones;
		}
		public Set<String> getOffice() {
			return office;
		}
		public void setOffice(Set<String> office) {
			this.office = office;
		}
		public Map<String, String> getCourses() {
			return courses;
		}
		public void setCourses(Map<String, String> courses) {
			this.courses = courses;
		}
}
