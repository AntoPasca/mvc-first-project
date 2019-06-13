import { Component, OnInit } from '@angular/core';
import { CarService } from '../car.service';
import { Car } from '../car';
import { Observable } from 'rxjs';

@Component({
  selector: 'car-list',
  templateUrl: './car-list.component.html',
  styleUrls: ['./car-list.component.css']
})
export class CarListComponent implements OnInit {

  cars: Observable<Car[]>;

  constructor(private carService : CarService) { }

  ngOnInit() {
    this.reloadData();
  }

  deleteAllCars(){
    this.carService.deleteAll().subscribe(
      data=>{
        console.log('deleteAllCarsData',data);
        this.reloadData();
      },
      error => console.log(error)
    );
  }

  reloadData(){
    this.cars = this.carService.getCarsList();
  }
}
