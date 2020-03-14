import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { map } from "rxjs/operators";
import { Employee } from "../common/employee";

@Injectable({
  providedIn: "root"
})
export class EmployeeService {
  private baseUrl = "http://localhost:8080/employees";
  //private baseUrl = "https://api.github.com/users/obiyanamala";
  response: any;
  constructor(private httpClient: HttpClient) {}

  getAllEmployees(): Observable<any> {
    return this.httpClient.get(this.baseUrl);
  }
}
