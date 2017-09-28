package com.BankAccount;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Login logincredentials = new Login();
		logincredentials.setUsername(request.getParameter("uname"));
		logincredentials.setPassword(request.getParameter("password"));

		LoginDAO userValidator = new LoginDAO();

		boolean result = false;
		try {
			result = userValidator.isUser(logincredentials);
		} catch (Exception e) {

			e.printStackTrace();
		}

		RequestDispatcher rd = null;

		if (result) {
			rd = request.getRequestDispatcher("applicantInfo.jsp");
			rd.forward(request, response);

		} else {
			request.setAttribute("error","Invalid Username or Password");
			rd=request.getRequestDispatcher("Login.jsp");            
			rd.include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
