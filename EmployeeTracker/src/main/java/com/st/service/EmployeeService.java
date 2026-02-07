package com.st.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Employee;
import com.main.exception.EmployeeNotFoundException;
import com.main.repository.IEmployeeRepo;


@Service("empService")
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	private IEmployeeRepo empRepo;
	
	
	@Override
	public Iterable<Employee> getAllEmployee(){
		return empRepo.findAll();
	}


	@Override
	public String registerEmployee(Employee emp) {
		Employee e = empRepo.save(emp);
		return "Employee is saved with id value "+e.getEmpno();
	}


	@Override
	public Employee getEmployeeByEmpNo(Integer empno) throws EmployeeNotFoundException{
		Employee employee = empRepo.findById(empno).orElseThrow(()->new EmployeeNotFoundException("Employee Not Found with specific Id"));
		return employee;
	}


	@Override
	public String updateEmployee(Employee emp) {
		return "Details updated of the employee whose empno is "+empRepo.save(emp).getEmpno();
	}


	@Override
	public String deleteEmployeeByEmpno(Integer empno) {
		empRepo.deleteById(empno);
		return "Employee with "+ empno + " as empno deleted Successfully";
	}
}
