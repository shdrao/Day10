package com.capgemini.employeeapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.employeeapp.dao.EmployeeDao;

/**
 * Servlet implementation class DeleteEmployeeController
 */
@WebServlet("/deleteEmployee")
public class DeleteEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;
	private EmployeeDao employeeDao;

	public DeleteEmployeeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String query = req.getParameter("id");
		employeeDao = (EmployeeDao) context.getAttribute("employeeDao");
		if (employeeDao.deleteEmployee(Integer.parseInt(query))) {
			RequestDispatcher rd = req.getRequestDispatcher("GetAllEmployees");
			rd.forward(req, resp);
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("error.jsp");
			rd.forward(req, resp);
		}
	}

}
