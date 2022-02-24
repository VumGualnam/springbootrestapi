package com.spring.tutorial.springrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController // @Controller + @ResponseBody
public class EmployeeController {
	
//	@RequestMapping(value = "/employees", method = RequestMethod.GET)
//	@ResponseBody
	@GetMapping("/employees")
	public String getEmployees() {
		return "displaying the list of employees";
	}

}
