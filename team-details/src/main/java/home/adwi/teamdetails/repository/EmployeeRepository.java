package home.adwi.teamdetails.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import home.adwi.teamdetails.entity.Employee;

@CrossOrigin(origins = "http://localhost:4200")
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
