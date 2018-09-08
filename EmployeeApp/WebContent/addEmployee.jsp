<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor='DodgerBlue' align='center'>
	<div class="boxed">

		<h1>Add New Employee</h1>
		<hr>
		<form action="addEmployee" method="post">
			<label>Employee id:</label> <input type="number" name="empId">
			<br> <br> <label>Employee Name:</label> <input type="text"
				name="empName" size="15" /> <br> <br> <label>Employee
				Salary:</label> <input type="number" name="empSalary" size="15" /> <br>
			<br> <select name="empDepartment">
				<option value="">---select---</option>
				<option value="IT">IT</option>
				<option value="ADMIN">ADMIN</option>
				<option value="ACCOUNTS">ACCOUNTS</option>
				<option value="HR">HR</option>
			</select> <br> <br> <input type="submit" value="addEmployee" />

		</form>

	</div>
</body>
</html>