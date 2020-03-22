package home.adwi.teamdetails.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import home.adwi.teamdetails.entity.EmployeeTeam;
import home.adwi.teamdetails.repository.EmployeeTeamRepository;

@Service
public class EmployeeTeamService {

	@Autowired
	private EmployeeTeamRepository employeeTeamRepository;

	public List<EmployeeTeam> getAllTeams() {
		List<EmployeeTeam> employeeTeams = new ArrayList<>();
		employeeTeamRepository.findAll().forEach(employeeTeams::add);
		return employeeTeams;
	}

}
