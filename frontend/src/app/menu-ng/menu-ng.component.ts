import { Component, OnInit } from '@angular/core';
import {MenuItem} from 'primeng/api';

@Component({
  selector: 'menu-ng',
  templateUrl: './menu-ng.component.html',
  styleUrls: ['./menu-ng.component.css']
})
export class MenuNGComponent implements OnInit {

  constructor() { }

  items: MenuItem[];

    ngOnInit() {
        this.items = [
            {label: 'Customer', icon: 'fa fa-fw fa-users',  routerLink: 'home/customer'},
            {label: 'Aggiungi Customer', icon: 'fa fa-fw fa-user-plus' , routerLink: 'home/add'},
            {label: 'Cerca Customer', icon: 'fa fa-fw fa-search' , routerLink: 'home/findbyage'},
            {label: 'Auto', icon: 'fa fa-fw fa-car' , routerLink: 'home/car'},
            {label: 'Aggiungi Auto', icon: 'fa fa-fw fa-plus-circle' , routerLink: 'home/addcar'},
            {label: 'Cerca Auto', icon: 'fa fa-fw fa-search' , routerLink: 'home/findbymodel'}
        ];
    }
}
