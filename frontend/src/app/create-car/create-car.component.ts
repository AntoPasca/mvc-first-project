import { Component, OnInit } from '@angular/core';
import { CarService } from '../car.service';
import { Car } from '../car';

@Component({
  selector: 'create-car',
  templateUrl: './create-car.component.html',
  styleUrls: ['./create-car.component.css']
})
export class CreateCarComponent implements OnInit {

  car : Car = new Car();
  submitted : boolean = false;
  error : boolean = false;
  success : boolean = false;
  constructor(private carService : CarService) { }

  ngOnInit() {
  }

  newCar(): void{
    this.car = new Car();
    this.submitted = false;
    this.success = false;
    this.error = false;
  }

  save(){
    this.carService.createCar(this.car).subscribe(
      data =>{
        this.success = true;
        console.log('dataCreateCar',data);
      },
      error => {
        this.error = true;
        console.log('errorCreateCar',error);
      }
    );
    this.car = new Car();
  }

  onSubmit(){
    this.submitted = true;
    this.success = false;
    this.error = false;
    this.save();
  }

}
