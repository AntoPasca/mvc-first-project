import { CarService } from './../car.service';
import { Car } from './../car';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'search-car',
  templateUrl: './search-car.component.html',
  styleUrls: ['./search-car.component.css']
})
export class SearchCarComponent implements OnInit {

  tipoRicerca : string
  valoreRicerca : string
  cars : Car[]
  pressed = false;
  selected = false;
  constructor(private carService : CarService) { }

  ngOnInit() {
  }

  private searchCarByModel(){
    this.carService.getCarsByModel(this.valoreRicerca).subscribe(
      data => {
        console.log('getAllCarsData',data);
        this.cars = data;
      },
      error => console.log(error)
    );
  }

  private searchCarByTarga(){
    this.carService.getCarsByTarga(this.valoreRicerca).subscribe(
      data => {
        console.log('getAllCarsData',data);
        this.cars = data;
      },
      error => console.log(error)
    );
  }

  private searchCarByCilindrata(){
    this.carService.getCarsByCilindrata(this.valoreRicerca).subscribe(
      data => {
        console.log('getAllCarsData',data);
        this.cars = data;
      },
      error => console.log(error)
    );
  }

  SelectValue(){
    this.selected = true;
    this.pressed = false;
  }

  onSubmit(){
    if(this.tipoRicerca == 'model') this.searchCarByModel();
    if(this.tipoRicerca == 'targa') this.searchCarByTarga();
    if(this.tipoRicerca == 'cilindrata') this.searchCarByCilindrata();
    this.pressed = true;
  }
}
