package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/credit")
public class CreditCardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CreditCardServlet() {
        super();
        
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String number = request.getParameter("number");
		String name = request.getParameter("name");
		String bank = request.getParameter("bank");
		String cvv = request.getParameter("cvv");
		String month = request.getParameter("month");
		String year = request.getParameter("year");
		
		out.println("<table align='center'  border='10'> <tr> ");
		out.println("<th>CARD NUMBER </th>");
		out.println("<th>NAME </th>");
		out.println("<th>BANK</th>");
		out.println("<th>CVV</th>");
		out.println("<th>MONTH</th>");
		out.println("<th>YEAR</th>");
		
		out.println("</tr> <tr>");
		out.println("<td>" + number  + " </td>");
		out.println("<td>" + name + "</td>");
		out.println("<td>" + bank + "</td>");
		out.println("<td>" + cvv + "</td>");
		out.println("<td>" + month + "</td>");
		out.println("<td>" + year + "</td>");
	
		
		out.println("</tr>");
		
		out.close();
		doGet(request, response);
	}

}
