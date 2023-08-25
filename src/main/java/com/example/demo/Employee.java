package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="employee") 
public class Employee {
	
	@Id 
	@Column(name="id") 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	int id; 

	@Column(name="name") 
	String name; 

	@Column(name="salary") 
	int salary; 

	@Column(name="designation") 
	String designation;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	

	public Employee(String name, int salary, String designation) {
		super();
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}


	public Employee(int id, String name, int salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}
	

}
