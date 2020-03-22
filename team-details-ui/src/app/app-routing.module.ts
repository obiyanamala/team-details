import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { HomeComponent } from "./components/home/home.component";
import { PageNotFoundComponent } from "./components/page-not-found/page-not-found.component";
import { EmployeeComponent } from "./components/employee/employee.component";
import { EmployeeTeamComponent } from "./components/employee-team/employee-team.component";

const routes: Routes = [
  { path: "", redirectTo: "/home", pathMatch: "full" },
  { path: "home", component: HomeComponent, pathMatch: "full" },
  { path: "employees", component: EmployeeComponent, pathMatch: "full" },
  { path: "teams", component: EmployeeTeamComponent, pathMatch: "full" },
  { path: "**", component: PageNotFoundComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
