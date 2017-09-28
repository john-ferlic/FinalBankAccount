package com.BankAccount;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IncomeDAO {
	
		private java.sql.Connection createConnection() throws SQLException {
			Driver driver = new oracle.jdbc.driver.OracleDriver();
			DriverManager.deregisterDriver(driver);
			return DriverManager.getConnection("jdbc:oracle:thin:@LTUS48954:1521:xe", "system", "admin");
		}
		
		public void insertIncome(Income income) {
			Connection con = null;
				String qryString = "INSERT INTO income (ssn, incomemode, annual, housemode, rent)" 
						+ "VALUES(?,?,?,?,?)";
				try{
				con = createConnection();
				PreparedStatement prepStatement = con.prepareStatement (qryString);
				prepStatement.setInt(1, income.getSsnNumber());
				prepStatement.setString(2, income.getModeIncome());
				prepStatement.setInt(3, income.getAnnual());
				prepStatement.setString(4, income.getHouse());
				prepStatement.setInt(5, income.getRent());
				prepStatement.executeUpdate();
				prepStatement.close();
				System.out.println("Income data updated successfully!");
				
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

