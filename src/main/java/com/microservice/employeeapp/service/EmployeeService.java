package com.microservice.employeeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.employeeapp.entity.Employee;
import com.microservice.employeeapp.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo EmployeeRepo;
	
	public Employee getEmployeeById(int id) {
		
		Employee employee=EmployeeRepo.findById(id).get();
		
		return employee;
	}
}
