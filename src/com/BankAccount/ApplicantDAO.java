package com.BankAccount;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ApplicantDAO {

	private java.sql.Connection createConnection() throws SQLException {
		Driver driver = new oracle.jdbc.driver.OracleDriver();
		DriverManager.deregisterDriver(driver);
		return DriverManager.getConnection("jdbc:oracle:thin:@LTUS000491:1521:xe", "system", "admin");

	}

	public void insertApplicant(Applicant appl) {
		Connection con = null;
		String qryString = "INSERT INTO applicant(applnumber,applfirstname,applmidname,appllastname,appaddrline1,appaddrline2,city,zipcode,state) "
				+ "VALUES(?,?,?,?,?,?,?,?,?)";

		try {
			con = createConnection();			
			PreparedStatement prepStatement = con.prepareStatement(qryString);
			prepStatement.setInt(1, appl.getApplnumber());
			prepStatement.setString(2, appl.getFirstname());
			prepStatement.setString(3, appl.getMidname());
			prepStatement.setString(4, appl.getLastname());
			prepStatement.setString(5, appl.getAddrline1());
			prepStatement.setString(6, appl.getAddrline2());
			prepStatement.setString(7, appl.getCity());
			prepStatement.setInt(8, appl.getZipcode());
			prepStatement.setString(9, appl.getState());
			prepStatement.executeUpdate();
			prepStatement.close();
			System.out.println("Applicant updated successfully!");

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
				}
			}
		}
	}

}
