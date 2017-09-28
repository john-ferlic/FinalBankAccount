package com.BankAccount;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EligibilityDAO {

	private java.sql.Connection createConnection() throws SQLException {
		//Connect system to database
		Driver driver = new oracle.jdbc.driver.OracleDriver();
		DriverManager.deregisterDriver(driver);
		return DriverManager.getConnection("jdbc:oracle:thin:@LTUS48820:1521:xe", "system", "admin");

	}
	
	//Write SQL INSERT statement
	public void insertEligibility(Eligibility elig) {
		Connection con = null;
		String SQLString = "INSERT INTO insert into eligibility values('accountType', 'initialDeposit', "
							+ "'directDepositMonthly', 'debitCardVisaMaster', 'LoanRequirement')" + " " 
							+ "VALUES(?,?,?,?,?)";
		
		//Insert user's information to previous SQL statement
		try {
			con = createConnection();
			PreparedStatement prepStatement = con.prepareStatement(SQLString);
			prepStatement.setString(1, elig.getAccountType());
			prepStatement.setInt(2, elig.getInitialDeposit());
			prepStatement.setString(3, elig.getDirectDeposit());
			prepStatement.setString(4, elig.getCard());
			prepStatement.setInt(5, elig.getLoanAmount());
			prepStatement.executeUpdate();
			prepStatement.close(); 
			
			//Print confirmation message
			System.out.println("Applicant's eligibility information added successfully!");

		//Error handler
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

