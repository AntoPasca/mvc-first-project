import { CarListComponent } from './car-list/car-list.component';
import { HomeComponent } from './home/home.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CustomersListComponent } from './customers-list/customers-list.component';
import { CreateCustomerComponent } from './create-customer/create-customer.component';
import { SearchCustomersComponent } from './search-customers/search-customers.component';
import { CreateCarComponent } from './create-car/create-car.component';
import { SearchCarComponent } from './search-car/search-car.component';

const routes: Routes = [
    { path: '', redirectTo: 'home', pathMatch: 'full' },
    { path: 'home', component: HomeComponent},
    { path: 'home/car', component: CarListComponent},
    { path: 'home/addcar', component: CreateCarComponent},
    { path: 'home/findbymodel', component: SearchCarComponent},
    { path: 'home/customer', component: CustomersListComponent },
    { path: 'home/add', component: CreateCustomerComponent },
    { path: 'home/findbyage', component: SearchCustomersComponent },
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})

export class AppRoutingModule { }
