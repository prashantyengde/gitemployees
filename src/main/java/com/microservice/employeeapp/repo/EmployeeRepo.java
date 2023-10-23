package com.microservice.employeeapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.employeeapp.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
