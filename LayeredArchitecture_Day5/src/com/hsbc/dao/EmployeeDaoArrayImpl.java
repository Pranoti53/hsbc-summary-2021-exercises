package com.hsbc.dao;

import com.hsbc.beans.Employee;
import com.hsbc.exception.EmployeeAlreadyExistsException;

public class EmployeeDaoArrayImpl implements EmployeeDao {

	private static Employee[] employeeDb = new Employee[10];
	private static int arrayIndexCounter = 0;

	@Override
	public void save(Employee employee) throws EmployeeAlreadyExistsException {
		
		for(int i=0;i<arrayIndexCounter;i++)
		{
			if(employeeDb[i].getId()==employee.getId())
			{
				throw new EmployeeAlreadyExistsException("This employee already exists!!");
			}
			else {
				employeeDb[arrayIndexCounter] = employee;
				arrayIndexCounter++;

			}
			
		}
	}

	@Override
	public Employee fetchEmployeeById(int id) {
		Employee emp = new Employee();
		for (int i = 0; i < arrayIndexCounter; i++) {
			if (employeeDb[i].getId() == id) {
				emp = employeeDb[i];
				return emp;
			}
		}
		return null;

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
	public void updateEmployee(int id, Employee employee) {
		Employee[] temp = findAllEmployees();
		for(Employee e: temp) {
			if(e.getId() == id) {
				e = employee;
				break;
			}

	}
}
}

	