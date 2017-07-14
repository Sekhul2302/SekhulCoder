package com.xsis.sekhul.javacoder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepareStatementUpdate {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");

			PreparedStatement stmt = con.prepareStatement("update TABLE_XSIS_EMPLOYEE set NAMA=? where id=?");
			stmt.setString(1, "Sonoo");// 1 specifies the first parameter in the
										// query i.e. name
			stmt.setInt(2, 101);

			int i = stmt.executeUpdate();
			System.out.println(i + " records updated");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
