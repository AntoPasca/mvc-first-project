package com.javasampleapproach.springrest.postgresql.dto;

public class Car {
	
	private long id;
	
	private String model;
	
	private String targa;
	
	private int cilindrata;

	public Car() { }
	
	public Car(String model, String targa, int cilindrata) {
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
