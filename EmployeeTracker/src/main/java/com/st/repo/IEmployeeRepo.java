package com.st.repo;

import org.springframework.data.repository.CrudRepository;

import com.st.entity.Employee;

public interface IEmployeeRepo extends CrudRepository<Employee,Integer> {

	
}

