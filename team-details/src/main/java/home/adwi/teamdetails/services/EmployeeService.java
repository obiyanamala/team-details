package home.adwi.teamdetails.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import home.adwi.teamdetails.entity.Employee;
import home.adwi.teamdetails.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees(){
		// return Arrays.asList(new Employee(1,"Obi","Lead"),new Employee(2,"Pramod","Senior Analyst"));
		List<Employee> employees = new ArrayList<>();
		employeeRepository.findAll().forEach(employees::add);
		return employees;
	}
	
	public Employee addEmployee(Employee emp){
		return employeeRepository.save(emp);
	}
}
