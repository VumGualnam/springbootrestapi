package com.spring.tutorial.springrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.tutorial.springrestapi.model.Employee;
import com.spring.tutorial.springrestapi.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
//	private static List<Employee> list = new ArrayList<>();
//	static {
//		Employee e = new Employee();
//		e.setName("Bush");
//		e.setAge(21L);
//		e.setDepartment("IT");
//		e.setEmail("email1@email.com");
//		e.setLocation("Location");
//		list.add(e);
//	}
	@Autowired
	private EmployeeRepository eRepository;
	
	@Override
	public List<Employee> getEmployees() {
		return eRepository.findAll();
	}
	
	
	
	@Override
	public void updateEmployeeById(long id, Employee employee) {
		Employee currentEmployee = eRepository.getById(id);
		currentEmployee.setName(employee.getName());
		System.out.println(currentEmployee.getName());
		eRepository.save(currentEmployee);
	}

	@Override
	public Employee addNewEmployee(Employee employee) {
		return eRepository.save(employee);	
	}

	@Override
	public void deleteEmployeeById(long id) {
		Employee currentEmployee = eRepository.getById(id);
		System.out.println(currentEmployee.getId());
		eRepository.delete(currentEmployee);
	}

	@Override
	public Employee getEmployeeById(long id) {
		Employee currentEmployee = eRepository.findById(id).orElse(null);
		return currentEmployee;
	}

}
