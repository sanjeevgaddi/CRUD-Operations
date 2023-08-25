package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeRepository er;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository er) {
		super();
		this.er = er;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return er.findAllByOrderByNameAsc();
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		java.util.Optional<Employee> op=er.findById(id);
		Employee e=op.get();
		return e;
	}

	@Override
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		 er.save(theEmployee);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		er.deleteById(id);
	}

}
