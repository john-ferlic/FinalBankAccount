package com.BankAccount;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EligibilityController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//Create new Eligibility class object
		Eligibility elig = new Eligibility();
	
		//Set eligibility values using from user form inputs
		elig.setAccountType(request.getParameter("accountType"));
		elig.setInitialDeposit(Integer.parseInt(request.getParameter("initialDeposit")));
		elig.setDirectDeposit(request.getParameter("directDeposit"));
		elig.setCard(request.getParameter("card"));
		elig.setLoanAmount(Integer.parseInt(request.getParameter("loanAmount")));
		elig.setCreditScore(request.getParameter("creditScore"));	
		
		//Call Eligibility DAO and dispatch information to next page in sequence (LoanInfo.jsp)
		EligibilityDAO eligibilityDao = new EligibilityDAO();
		eligibilityDao.insertEligibility(elig);
		RequestDispatcher dispatcher = request.getRequestDispatcher("LoanInfo.jsp");
		dispatcher.forward(request, response);
	}
	
	//CALCULATE APPLICANT'S INTEREST
	public Double calculateInterestRate(Eligibility elig) {
		
		Double intrestRate = 0.0;
		
		//Assigns value to interest rate depending on credit score rating
		//Retrieve information from values stored in creditScore
		if (elig.getCreditScore().equalsIgnoreCase("excellent")) {
			intrestRate = 4.0;
		} else 	if (elig.getCreditScore().equalsIgnoreCase("good")) {
			intrestRate = 8.0;
		} else 	if (elig.getCreditScore().equalsIgnoreCase("fair")) {
			intrestRate = 12.0;
		} else 	if (elig.getCreditScore().equalsIgnoreCase("bad")) {
			intrestRate = 16.0;
		} 
		
		//If you chose Direct Debit as YES, you will get 10% discount on Interest Rate for Loan.
		if (elig.getDirectDeposit().equalsIgnoreCase("yes")) {
			intrestRate = intrestRate - intrestRate/10;
		}
		
		return intrestRate;
	}
}
