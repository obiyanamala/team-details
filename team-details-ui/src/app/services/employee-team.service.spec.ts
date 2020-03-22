import { TestBed } from "@angular/core/testing";

import { EmployeeTeamService } from "./employee-team.service";

describe("TeamService", () => {
  let service: EmployeeTeamService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EmployeeTeamService);
  });

  it("should be created", () => {
    expect(service).toBeTruthy();
  });
});
