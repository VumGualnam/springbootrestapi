package com.spring.tutorial.springrestapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	@ResponseBody
	public String getEmployees() {
		return "displaying the list of employees";
	}

}
