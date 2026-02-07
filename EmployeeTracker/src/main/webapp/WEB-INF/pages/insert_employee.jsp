<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:if test="${empty message}">
<h1 style="color:red;text-align:center">Register Employee</h1>
<frm:form modelAttribute="emp">
	<table align="center" bgcolor="cyan">
	
	<tr>
	<td>Employee Name</td>
	<td><frm:input path="ename"/></td>
	</tr>
	
	<tr>
	<td>Employee Job Role</td>
	<td><frm:input path="job"/></td>
	</tr>
	
	<tr>
	<td>Employee Salary</td>
	<td><frm:input path="salary"/></td>
	</tr>
	
	<tr>
	<td>Employee Department No</td>
	<td><frm:input path="deptno"/></td>
	</tr>
	
	<tr>
	<td><input type="submit" value="Submit"></td>
	<td><input type="reset" value="Cancel"></td>
	</tr>
	</table>

</frm:form>
</c:if>
<br>
<c:if test="${!empty message}">
	<h1 style="color:red;text-align:center">${message}</h1>
	<center>
	<a href="emp_add"><img src="images/add.jpg" width="40px" height="40px">Add Another Employee</a>&nbsp; &nbsp;
	<a href="./"><img src="images/home.jpg" width="40px" height="40px">Home</a>&nbsp; &nbsp;
	<a href="report">Show Employee</a>
	</center>
</c:if>




