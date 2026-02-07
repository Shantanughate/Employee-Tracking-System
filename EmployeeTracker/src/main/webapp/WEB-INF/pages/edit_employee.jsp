<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1 style="color:red;text-align:center">Update Employee Details</h1>
<frm:form modelAttribute="emp">
	<table align="center" bgcolor="cyan">
	
	<tr>
	<td>Employee EMP No</td>
	<td><frm:input path="empno" readonly="true"/></td>
	</tr>
	
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
	<td><input type="submit" value="Update Details"></td>
	<td><input type="reset" value="Cancel"></td>
	</tr>
	</table>

</frm:form>


