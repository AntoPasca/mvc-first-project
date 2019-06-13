import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { CreateCustomerComponent } from './create-customer/create-customer.component';
import { CustomerDetailsComponent } from './customer-details/customer-details.component';
import { CustomersListComponent } from './customers-list/customers-list.component';
import { SearchCustomersComponent } from './search-customers/search-customers.component';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { CreateCarComponent } from './create-car/create-car.component';
import { CarDetailComponent } from './car-detail/car-detail.component';
import { CarListComponent } from './car-list/car-list.component';
import { SearchCarComponent } from './search-car/search-car.component';
import { HomeComponent } from './home/home.component';
import { NavbarComponent } from './navbar/navbar.component';
import { MenuNGComponent } from './menu-ng/menu-ng.component';
import {TabMenuModule} from 'primeng/tabmenu';
import {ButtonModule} from 'primeng/button';
import {DialogModule} from 'primeng/dialog';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';


@NgModule({
  declarations: [
    AppComponent,
    CreateCustomerComponent,
    CustomerDetailsComponent,
    CustomersListComponent,
    SearchCustomersComponent,
    CreateCarComponent,
    CarDetailComponent,
    CarListComponent,
    SearchCarComponent,
    HomeComponent,
    NavbarComponent,
    MenuNGComponent
  ],
  imports: [
    TabMenuModule,
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,
    ButtonModule,
    DialogModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
