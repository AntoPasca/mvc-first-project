import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'search-customers',
  templateUrl: './search-customers.component.html',
  styleUrls: ['./search-customers.component.css']
})
export class SearchCustomersComponent implements OnInit {

  age: number;
  customers: Customer[];
  pressed = false;
  selected = false;
  tipoRicerca : string;
  valoreRicerca;

  constructor(private dataService: CustomerService) { }

  ngOnInit() {
    this.age = 0;
  }

  private searchCustomerByName() {
    this.dataService.getCustomersByName(this.valoreRicerca)
      .subscribe(customers =>{
        this.customers = customers
      });
  }

  private searchCustomerByAge() {
    this.dataService.getCustomersByAge(this.valoreRicerca)
      .subscribe(customers =>{
        this.customers = customers
      });
  }

  SelectValue(){
    this.selected = true;
    this.pressed = false;
  }

  onSubmit() {
    if(this.tipoRicerca == 'name') this.searchCustomerByName();
    if(this.tipoRicerca == 'age') this.searchCustomerByAge();
    this.pressed = true;
  }
}
