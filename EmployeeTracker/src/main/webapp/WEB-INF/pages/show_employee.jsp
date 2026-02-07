<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<c:choose>
	<c:when test="${!empty empList}">
	<h1 style="color:green;text-align:center">Employee Report</h1>
	<table border="1", align="center", bgcolor="cyan">
			<tr style="color:red">
				<th>EmpNo</th>
				<th>EName</th>
				<th>Job</th>
				<th>Salary</th>
				<th>DeptNo</th>
				<th>Operations</th>
			</tr>
		
			<c:forEach var="emp" items="${empList}">
			<tr style="color:blue">
			<td>${emp.empno}</td>
			<td>${emp.ename}</td>
			<td>${emp.job}</td>
			<td>${emp.salary}</td>
			<td>${emp.deptno}</td>
			<td><a href="emp_edit?empno=${emp.empno}"><img src="images/edit.jpg" width="30px" height="30px"></a>
				<a href="emp_delete?empno=${emp.empno}" onclick="return confirm('Do you want to delete the employee')"><img src="images/delete.jpg" width="30px" height="30px"></a>
			</td>
			</tr>
			</c:forEach>
	</table>
	</c:when>
	<c:otherwise>
		<h1 style="color:red;text-align:center">Employee Not Found</h1>
	</c:otherwise>
</c:choose>
<br>
<center>
<a href="emp_add"><img src="images/add.jpg" width="40px" height="40px">Add Employee</a>&nbsp; &nbsp;
<a href="./"><img src="images/home.jpg" width="40px" height="40px">Home</a>
</center>

<c:if test="${!empty message}">
	<h1 style="color:red;text-align:center">${message}</h1>
</c:if>

