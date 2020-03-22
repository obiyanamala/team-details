import { Component, OnInit } from "@angular/core";
import { EmployeeTeam } from "src/app/common/employee-team";
import { EmployeeTeamService } from "src/app/services/employee-team.service";

@Component({
  selector: "app-employee-team",
  templateUrl: "./employee-team.component.html",
  styleUrls: ["./employee-team.component.css"]
})
export class EmployeeTeamComponent implements OnInit {
  employeeTeams: EmployeeTeam[] = [];

  constructor(private employeeTeamService: EmployeeTeamService) {}

  ngOnInit(): void {
    this.employeeTeamService.getAllTeams().subscribe(data => {
      this.employeeTeams = data;
    });
  }
}
