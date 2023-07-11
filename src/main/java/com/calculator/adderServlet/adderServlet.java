package com.calculator.adderServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controller")
public class adderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   
	public adderServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/adderPage.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstnumber= request.getParameter("firstnumber");
		String secondnumber= request.getParameter("secondnumber");
		double a = Double.parseDouble(firstnumber);
		double b = Double.parseDouble(secondnumber);
		double c=a+b;
		// for print on console
		System.out.println(c);
		
		//for print on the same jsp page , it will not redirech to another jsp page.
//		response.getWriter().println("<h1>The result is : <h/>"+c);
//		PrintWriter out=  response.getWriter();
//		out.println("<br><hr>Thank You :)");
		
		//it will redirech in a new jsp page and print
		request.setAttribute("myVariable", c);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/result.jsp");
		dispatcher.forward(request, response);
		
	}

}
