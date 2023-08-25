package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;


public interface EmployeeService {

	public List<Employee> findAll(); 
	public Employee  findById(int id);
	public void save(Employee theEmployee);
	public void deleteById(int id);
}
