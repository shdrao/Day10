package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class LoginServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;

	public LoginServlet1() {
		super();

	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		HashMap<String, String> users = (HashMap<String, String>) context.getAttribute("usersData");

		if (users.containsKey(username)) {
			if (users.get(username).equals(password)) {
				out.println("<h1>Welcome:" + username + "</h1>");
			} else {
				out.print("<h1>Invalid credentials</h1>");
				out.print("<br><br>a href='login.html'>Try Again<a>");
			}
		} else {
			out.print("<h1>User doesn't exist</h1>");
			out.print("<br><br>a href='login.html'>Try Again<a>");
		}
		out.close();
	}

}
