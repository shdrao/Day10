package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.day10.Employee;

@WebServlet("/Employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Employee> dummy = new ArrayList<>();

	public EmployeeServlet() {
		super();

	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		dummy.add(new Employee(1, "abc", "it", 25000));
		dummy.add(new Employee(2, "def", "bt", 15000));
		dummy.add(new Employee(3, "ghi", "ee", 10000));
		dummy.add(new Employee(4, "jkl", "cs", 225000));
		dummy.add(new Employee(5, "mno", "me", 5000));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		boolean x=false;
		for (Employee employee : dummy) {
			if (employee.getid() == Integer.parseInt(id)) {
				x = true;
				out.println("<table align='center'  border='10'> <tr> ");
				out.println("<th>ID </th>");
				out.println("<th>NAME </th>");
				out.println("<th>DEPARTMENT </th>");
				out.println("<th>SALARY</th>");
				out.println("</tr> <tr>");
				out.println("<td>" + employee.getid() + " </td>");
				out.println("<td>" + employee.getName() + "</td>");
				out.println("<td>" + employee.getDepartment() + "</td>");
				out.println("<td>" + employee.getSalary() + "</td>");
				out.println("</tr>");

			}
			

			

		}
		if (!x)
			out.println("User not found");
		out.close();
	}
}
