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
import com.capgemini.employeeapp.model.Employee;

@WebServlet("/editEmployee" )
public class UpdateEmplyeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;
	private EmployeeDao employeeDao;
	private Employee employee;

	public UpdateEmplyeeController() {
		super();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init();
		context = config.getServletContext();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		employeeDao = (EmployeeDao) context.getAttribute("employeeDao");
		employee = employeeDao.findEmployeeById(id);
		request.setAttribute("editEmployee", employee);
		RequestDispatcher rd = request.getRequestDispatcher("update.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int employeeId = Integer.parseInt(req.getParameter("empId"));
		String employeeName = req.getParameter("empName");
		double employeeSalary = Double.parseDouble(req.getParameter("empSalary"));
		String employeeDept = req.getParameter("empDepartment");
		employeeDao = (EmployeeDao) context.getAttribute("employeeDao");
		employee=employeeDao.updateEmployee(new Employee(employeeId, employeeName, employeeSalary, employeeDept));
		req.setAttribute("edited", true);
		req.setAttribute("editEmployee", employee);
		RequestDispatcher dispatcher = req.getRequestDispatcher("update.jsp");
		dispatcher.forward(req, resp);
	}

}
