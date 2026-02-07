package com.st.service;

import com.st.entity.Employee;
import com.st.exception.EmployeeNotFoundException;

public interface IEmployeeService {

	public Iterable<Employee> getAllEmployee();
	
	public String registerEmployee(Employee emp);
	
	public Employee getEmployeeByEmpNo(Integer empno) throws EmployeeNotFoundException;
	
	public String updateEmployee(Employee emp);
	
	public String deleteEmployeeByEmpno(Integer empno);
}
