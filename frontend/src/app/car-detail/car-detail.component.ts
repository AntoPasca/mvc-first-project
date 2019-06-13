import { CarService } from './../car.service';
import { Car } from './../car';
import { Component, OnInit, Input } from '@angular/core';
import { CarListComponent } from '../car-list/car-list.component';

@Component({
  selector: 'tr[car-detail]',
  templateUrl: './car-detail.component.html',
  styleUrls: ['./car-detail.component.css']
})
export class CarDetailComponent implements OnInit {

  @Input() car : Car;
  private update : boolean = false;
  constructor(private carService : CarService,  private listComponent: CarListComponent) { }

  ngOnInit() {
  }

  deleteCar(){
    this.carService.deleteCar(this.car.id).subscribe(
      data =>{
        console.log('deleteCarData',data);
        this.listComponent.reloadData();
      },
      error => {
        console.log(error);
      }
    );
  }

  updateCar(){
    if(this.update){
      this.carService.updateCar(this.car.id,this.car).subscribe(
        data => {
          console.log('updateCar',data);
        },
        error => {
          console.log('errorUpdate',error);
        }
      );
      this.update = false;

    }
      
    else this.update = true;
  }
}
