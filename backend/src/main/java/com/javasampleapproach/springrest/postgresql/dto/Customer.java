package com.javasampleapproach.springrest.postgresql.dto;

public class Customer {

	private long id;

	private String name;

	private int age;
	
	private String password;

	private boolean active;

	public Customer() {
	}

	public Customer(String name, int age, String password) {
		this.name = name;
		this.age = age;
		this.password = password;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", password=" + password + ", active="
				+ active + "]";
	}

	
}
