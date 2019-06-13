package com.javasampleapproach.springrest.postgresql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Table (name = "car")
public class CarModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "targa")
	@Size(min=6 , max=7 , message="La targa deve essere di 6 lettere/numeri")
	private String targa;
	
	@Column(name = "cilindrata")
	@Min(value = 1000, message="La cilindrata minima è 1000")
	@Max(value = 3000, message="La cilindrata massima è 3000")
	private int cilindrata;

	public CarModel() {
		
	}
		
	public CarModel(String model, String targa, int cilindrata) {
		this.model = model;
		this.targa = targa;
		this.cilindrata = cilindrata;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", targa=" + targa + ", cilindrata=" + cilindrata + "]";
	}
	
}
