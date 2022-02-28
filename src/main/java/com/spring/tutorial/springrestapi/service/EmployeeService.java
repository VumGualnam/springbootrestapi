package com.spring.tutorial.springrestapi.service;

import java.util.List;

import com.spring.tutorial.springrestapi.model.Employee;

public interface EmployeeService {
	
	List<Employee> getEmployees();
	
	Employee addNewEmployee(Employee employee);
	
	void updateEmployeeById(long id, Employee employee);
	
	void deleteEmployeeById(long id);
	
	Employee getEmployeeById(long id);
}
