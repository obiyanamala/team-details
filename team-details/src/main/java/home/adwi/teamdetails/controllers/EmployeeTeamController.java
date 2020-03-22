package home.adwi.teamdetails.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import home.adwi.teamdetails.entity.EmployeeTeam;
import home.adwi.teamdetails.services.EmployeeTeamService;

@RestController
@RequestMapping(value = "")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeTeamController {

	@Autowired
	private EmployeeTeamService employeeTeamService;

	@RequestMapping("/teams")
	public List<EmployeeTeam> getAllEmployees() {
		return employeeTeamService.getAllTeams();
	}

}
