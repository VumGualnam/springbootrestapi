package com.spring.tutorial.springrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.tutorial.springrestapi.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
