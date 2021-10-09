package com.hsbc.dao;

import com.hsbc.beans.Employee;

public class EmployeeDaoArrayImpl implements EmployeeDao {

	private static Employee[] employeeDb = new Employee[10];
	private static int arrayIndexCounter = 0;

	@Override
	public void save(Employee employee) {
		employeeDb[arrayIndexCounter] = employee;
		arrayIndexCounter++;
	}

	@Override
	public Employee fetchEmployeeById(int id) {
		Employee emp = new Employee();
		for (int i = 0; i < arrayIndexCounter; i++) {
			if (employeeDb[i].getId() == id) {
				emp = employeeDb[i];
			}
		}
		return emp;

	}

	@Override
	public Employee[] findAllEmployees() {
		Employee[] tempDb = new Employee[arrayIndexCounter];
		for (int index = 0; index < arrayIndexCounter; index++) {
			tempDb[index] = employeeDb[index];
		}
		return tempDb;
	}

	@Override
	public Employee updateEmployeeName(int id, String name) {
		Employee emp1 = new Employee();
		for (int i = 0; i < arrayIndexCounter; i++) {
			if (employeeDb[i].getId() == id) {
				employeeDb[i].setName(name);
				emp1 = employeeDb[i];
			}
		}
		return emp1;

	}

	@Override
	public Employee updateEmployeeSalary(int id, double salary) {
		Employee emp2 = new Employee();
		for (int i = 0; i < arrayIndexCounter; i++) {
			if (employeeDb[i].getId() == id) {
				employeeDb[i].setSalary(salary);
				emp2 = employeeDb[i];
			}
		}
		return emp2;

	}
}
