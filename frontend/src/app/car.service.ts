import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Car } from './car';

@Injectable({
  providedIn: 'root'
})
export class CarService {

private baseUrl = "http://localhost:8080/api/cars"

  constructor(private http : HttpClient) { }

  getCars(id: number): Observable<Object> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createCar(car : Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}` + `/create`, car);
  }

  updateCar(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deleteCar(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

  getCarsList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }

  getCarsByModel(model: string): Observable<any> {
    return this.http.get(`${this.baseUrl}/model/${model}`);
  }

  getCarsByTarga(targa: string): Observable<any> {
    return this.http.get(`${this.baseUrl}/targa/${targa}`);
  }

  getCarsByCilindrata(cilindrata: string): Observable<any> {
    return this.http.get(`${this.baseUrl}/cilindrata/${cilindrata}`);
  }

  deleteAll(): Observable<any> {
    return this.http.delete(`${this.baseUrl}` + `/delete`, { responseType: 'text' });
  }
}
