package com.xsis.sekhul.javacoder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepareStatement {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");

			PreparedStatement stmt = con.prepareStatement("insert into TABLE_XSIS_EMPLOYEE (ID,NAMA) values(?,?)");
			stmt.setInt(1, 103);// 1 specifies the first parameter in the query
			stmt.setString(2, "ASZIZ");

			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted");

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
