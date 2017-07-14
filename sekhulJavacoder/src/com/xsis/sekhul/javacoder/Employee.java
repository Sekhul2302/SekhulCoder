package com.xsis.sekhul.javacoder;

public class Employee {
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int id, String name, String address, double salary, String no_Hp) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.no_Hp = no_Hp;
	}





	// property
	private int id;
	private String name;
	private String address;
	private double salary;
	private String no_Hp;
	
	
	
	public String getNo_Hp() {
		return no_Hp;
	}



	public void setNo_Hp(String no_Hp) {
		this.no_Hp = no_Hp;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public void info() {
		System.out.println("id : " + this.id);
		System.out.println("name :" + this.name);
		System.out.println("address: " + this.address);
		System.out.println("salary: " + this.salary);
	}
}
