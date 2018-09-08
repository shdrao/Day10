<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       
       
        <div class="card mx-auto mt-3" align="center" style="width: 30rem;">
         <h3 class="mx-auto  m-3">Edit Employee</h3>
        <form action="editEmployee" method="post" class="mx-auto ml-5 mr-5 mt-0 card-body" >
            <label>Employee ID:</label> <input type="number" readonly class="form-control" value="${editEmployee.employeeId }" size="10" name="empId" required /><br>
            <label>Employee Name:</label> <input type="text" class="form-control" name="empName" value="${editEmployee.employeeName }"
                required /> <br>
            <label>Employee Salary:</label> <input type="number" class="form-control" name="empSalary"
                required value="${editEmployee.employeeSalary }" /><br> <label>Employee Department:</label> 
            <select
                name="empDepartment" class="form-control" required >
                <option value="${editEmployee.employeeDepartment }">${editEmployee.employeeDepartment }</option>
                <option value="IT">IT</option>
                <option value="ADMIN">ADMIN</option>
                <option value="HR">HR</option>
                <option value="ACCOUNTS">ACCOUNTS</option>
            </select>
            
            
            <br> <button type="submit" class="btn btn-outline-primary btn-sm">Edit Employee</button>
			<a href="GetAllEmployees">Click Here</a>
        </form>
        </div>
</body>
</html>