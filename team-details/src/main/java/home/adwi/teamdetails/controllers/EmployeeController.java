package home.adwi.teamdetails.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import home.adwi.teamdetails.entity.Employee;
import home.adwi.teamdetails.services.EmployeeService;

@RestController
@RequestMapping(value="")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		// return Arrays.asList(new Employee(1,"Obi","Lead"),new Employee(2,"Pramod","Senior Analyst"));
		return employeeService.getAllEmployees();
	}

}
