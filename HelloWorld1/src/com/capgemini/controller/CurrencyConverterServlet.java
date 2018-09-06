package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CurrencyConverter")
public class CurrencyConverterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CurrencyConverterServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<table align='center' bgcolor='pink' border='10'> <tr> ");
		out.println("<th>USD </th>");
		out.println("<th>INR </th>");
		out.println("</tr>");
		for (int i = 1; i <= 50; i++) {
			out.println("<tr>");
			out.println("<td>$");
			out.println(i);
			out.println("<td>Rs");
			out.println(i * 45);
			out.println("</tr>");
		}
		out.println("</table>");
		out.close();
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
