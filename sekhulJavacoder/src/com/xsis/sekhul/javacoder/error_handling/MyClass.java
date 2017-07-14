package com.xsis.sekhul.javacoder.error_handling;

import java.util.Arrays;

public class MyClass {
	public void index(){
		String[] data =new String[3];
		
		System.err.println("Set to array");
		data[0]="Hallo";
		data[1]="world";
		data[2]="xsis";
		try {
			data[3]="Mitra";
			data[4]="utama";
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		System.out.println(Arrays.toString(data));
	}
	
	public static void main(String[] args) {
		MyClass m=new MyClass();
		m.index();
	}
}
