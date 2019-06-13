import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  customersPressed : boolean = false;
  carsPressed : boolean = false;
  constructor() { }

  ngOnInit() {
    this.carsPressed = false;
    this.customersPressed = false;
  }

  pressCust(){
    this.customersPressed = true;
    this.carsPressed = false;
  }

  pressCar(){
    this.carsPressed = true;
    this.customersPressed = false;
  }

}
