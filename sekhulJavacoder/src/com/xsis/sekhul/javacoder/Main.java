package com.xsis.sekhul.javacoder;

public class Main {
	public static void main(String[] args) {
		//empty construktor //membuat manual setter
		Employee emp = new Employee();
		
		emp.setId(1);
		emp.setName("sekhul");
		emp.setAddress("Sokatengah");
		emp.setSalary(5000);
		
		Employee emp2=new Employee(2,"tina","jakarta selatan",5000);
		
		emp.info();
		emp2.info();
	}
}
