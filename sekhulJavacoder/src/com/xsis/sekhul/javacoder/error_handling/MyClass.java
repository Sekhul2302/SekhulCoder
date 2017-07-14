package com.xsis.sekhul.javacoder.error_handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MyClass {
	public void index() {
		String[] data = new String[3];

		System.err.println("Set to array");
		data[0] = "Hallo";
		data[1] = "world";
		data[2] = "xsis";
		try {
			data[3] = "Mitra";
			data[4] = "utama";
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println(Arrays.toString(data));
	}

	public void indeks2() {
		String data = "";
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String datas[] = new String[1];
		try {
			data = br.readLine();
			int angka = Integer.parseInt(data);
			datas[0] = "hallo";
			datas[1] = "hallo2";
		} catch (NumberFormatException e) {
			System.err.println("error: " + e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Terjadi Pada Indeks Array");
		} catch (Exception e) {
			System.err.println("Terjadi Error");
		} finally {
			try {
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		MyClass m = new MyClass();
		m.indeks2();
	}
}
