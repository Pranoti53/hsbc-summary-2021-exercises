package com.hsbc.service;

import com.hsbc.beans.Employee;

public interface EmployeeService {
	public void store(Employee employee);

	public Employee findEmployee(int id);

	public Employee[] findAllEmployees();

	public Employee updateSalary(int id, double salary);

	public Employee updateName(int id, String name);

}
