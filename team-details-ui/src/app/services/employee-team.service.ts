import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";

@Injectable({
  providedIn: "root"
})
export class EmployeeTeamService {
  private baseUrl = "http://localhost:8080/teams";
  response: any;
  constructor(private httpClient: HttpClient) {}

  getAllTeams(): Observable<any> {
    return this.httpClient.get(this.baseUrl);
  }
}
