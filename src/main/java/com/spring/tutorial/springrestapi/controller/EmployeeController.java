package com.spring.tutorial.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.tutorial.springrestapi.model.Employee;
import com.spring.tutorial.springrestapi.service.EmployeeService;

//@Controller
@RestController // @Controller + @ResponseBody
public class EmployeeController {
//	
//	@Value("${app.name}")
//	private String appName;
//	
//	@Value("${app.version}")
//	private String appVersion;
//	
//	@GetMapping("/version")
//	public String getAppDetails () {
//		return appName+" - "+appVersion;
//	}
	@Autowired
	private EmployeeService eService;
	
//	@RequestMapping(value = "/employees", method = RequestMethod.GET)
//	@ResponseBody
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
//		return "displaying the list of employees";
		return eService.getEmployees();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable(value="id") long id) {
//		return "Fetching the employee details for the id " + id;
		return eService.getEmployeeById(id);
	}
	
	@PostMapping("/addNewEmployee")
	public void addNewEmployee(@RequestBody Employee employee) {
//		return "saving the employee details to the database "+ employee;
		eService.addNewEmployee(employee);
	}
	
	@PostMapping("/employees/{id}")
	public void updateEmployeeById (@PathVariable("id") long id, @RequestBody Employee employee) {
		System.out.println("saving the employee details to the database ");
		eService.updateEmployeeById(id, employee);
		
	}
	
	// localhost:8080/employees?id=34
	// localhost:8080/employees/34 // both should work
	@DeleteMapping(value = "/deleteEmployee/{id}")
	public ResponseEntity<Long> deleteEmployeeById (@PathVariable("id") long id) {
//		return "Deleting the employee details of the id ";
		eService.deleteEmployeeById(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}
}
