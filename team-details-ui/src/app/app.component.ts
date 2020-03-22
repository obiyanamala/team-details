import { Component } from "@angular/core";
import { MatToolbarModule } from "@angular/material/toolbar";
import { Router } from "@angular/router";

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"]
})
export class AppComponent {
  title = "Employee Details";
  routes: any[];
  activeLinkIndex = -1;
  constructor(private router: Router) {
    this.routes = [
      {
        linkName: "Home",
        url: "./home",
        index: 0
      },
      {
        linkName: "Employees",
        url: "./employees",
        index: 1
      },
      {
        linkName: "Teams",
        url: "./teams",
        index: 2
      }
    ];
  }
  ngOnInit(): void {
    this.router.events.subscribe(res => {
      this.activeLinkIndex = this.routes.indexOf(
        this.routes.find(tab => tab.url === "." + this.router.url)
      );
    });
  }
}
