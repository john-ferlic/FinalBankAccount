package com.BankAccount;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ApplicantController
 */
public class ApplicantController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Applicant appl = new Applicant();
		appl.setFirstname(request.getParameter("fname"));
		appl.setMidname(request.getParameter("mname"));
		appl.setLastname(request.getParameter("lname"));
		appl.setAddrline1(request.getParameter("address1"));
		appl.setAddrline2(request.getParameter("address2"));
		appl.setCity(request.getParameter("city"));
		appl.setState(request.getParameter("state"));
		appl.setZipcode(Integer.parseInt(request.getParameter("zip")));

		ApplicantDAO applicantDao = new ApplicantDAO();
		applicantDao.insertApplicant(appl);
		RequestDispatcher dispatcher = request.getRequestDispatcher("IncomeInfo.jsp");
		dispatcher.forward(request, response);
	}
}
