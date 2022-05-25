package com.example.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.rest.entity.Employee;
import com.example.rest.repositorio.EmployeeRepository;
import com.example.rest.services.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Boolean saveUser(Employee employee) {
		
		try {
		//	employee.save(employee);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
