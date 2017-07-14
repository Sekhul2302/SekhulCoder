package com.xsis.sekhul.javacoder;

public class Main {
	//primitive data type
	
	public int umur = 40;
	//pholymorpism
	
	/*public Integer umur2 = 40;
	public Employee director = new Manager();
	public Employee manager = new Manager();
	public Employee programer = new Programmer();
	public Employee employee = new Employee();*/
	
	public Employee employee,director,programmer, manager;
	

	public void inhiritance_Example() {
		
		employee=new Employee();
		director=new Director();
		programmer=new Programmer();
		manager=new Manager();
		
		director.setSalary(5000.0);
		System.out.println("salary directore "+director.getSalary());
		
		//casting
		Employee a=new Manager();
		Manager b=(Manager) new Employee();
	}

	public static void main(String[] args) {
		Main m=new Main();
		m.inhiritance_Example();
	}
}
