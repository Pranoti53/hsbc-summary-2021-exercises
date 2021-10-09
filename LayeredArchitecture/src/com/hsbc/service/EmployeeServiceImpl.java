package com.hsbc.service;

import com.hsbc.beans.Employee;
import com.hsbc.dao.EmployeeDao;
import com.hsbc.dao.EmployeeDaoArrayImpl;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao dao = null;

	public EmployeeServiceImpl() {
		// this is wrong approach we need to use factory pattern
		dao = new EmployeeDaoArrayImpl();
	}

	@Override
	public void store(Employee employee) {
		dao.save(employee);
	}

	@Override
	public Employee findEmployee(int id) {
		return dao.fetchEmployeeById(id);
	}

	@Override
	public Employee[] findAllEmployees() {
		return dao.findAllEmployees();
	}

	@Override
	public Employee updateSalary(int id, double salary) {
		Employee emp1 = new Employee();
		emp1 = dao.updateEmployeeSalary(id, salary);
		return emp1;
	}

	@Override
	public Employee updateName(int id, String name) {
		Employee emp2 = new Employee();
		emp2 = dao.updateEmployeeName(id, name);
		return emp2;
	}

}
