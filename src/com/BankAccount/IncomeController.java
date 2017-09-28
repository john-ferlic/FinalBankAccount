package com.BankAccount;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IncomeController
 */
public class IncomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Income inc = new Income();
		inc.setSsnNumber (Integer.parseInt(request.getParameter("ssnNumber")));
		inc.setModeIncome(request.getParameter("modeIncome"));
		inc.setAnnual (Integer.parseInt(request.getParameter("annual")));
		inc.setHouse(request.getParameter("house"));
		inc.setRent (Integer.parseInt(request.getParameter("rent")));
		
		IncomeDAO incomeDao = new IncomeDAO();
		incomeDao.insertIncome(inc);
		RequestDispatcher dispatcher = request.getRequestDispatcher("eligibilityInfo.jsp");
		dispatcher.forward(request, response);
	}

}
