package com.hsbc.dao;

import java.util.Set;

import com.hsbc.beans.Employee;
import com.hsbc.exception.EmployeeAlreadyExistsException;

public interface EmployeeDao {
	public void save(Employee employee);

	public Employee fetchEmployeeById(int id);

	public Set<Employee> findAllEmployees();

	public void updateEmployee(int id, Employee employee);


}
