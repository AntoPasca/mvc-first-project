package com.javasampleapproach.springrest.postgresql.model;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class CustomerModel{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="active")
	private Boolean active;
	
	@Column(name="age")
	private Integer age;

	@Column(name="name")
	private String name;

	@Column(name="password")
	private String passowrd;

	public CustomerModel() {}
	
	public CustomerModel(Boolean active, Integer age, String name, String passowrd) {
		this.active = active;
		this.age = age;
		this.name = name;
		this.passowrd = passowrd;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassowrd() {
		return this.passowrd;
	}

	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}

	@Override
	public String toString() {
		return "CustomerModel [id=" + id + ", active=" + active + ", age=" + age + ", name=" + name + ", passowrd="
				+ passowrd + "]";
	}
	
}