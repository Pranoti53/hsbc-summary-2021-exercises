package com.hsbc.service;

import java.util.Set;

import com.hsbc.beans.Employee;
import com.hsbc.exception.EmployeeAlreadyExistsException;
import com.hsbc.exception.EmployeeNotFoundException;

public interface EmployeeService {
	public void store(Employee employee) throws EmployeeAlreadyExistsException;

	public Employee findEmployee(int id) throws EmployeeNotFoundException;

	public Set<Employee> findAllEmployees();

	public void updateSalary(int id, double salary) throws EmployeeNotFoundException;

	public void updateName(int id, String name) throws EmployeeNotFoundException;

}
