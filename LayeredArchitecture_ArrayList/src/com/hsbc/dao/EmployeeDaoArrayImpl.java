package com.hsbc.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.hsbc.beans.Employee;
//import com.hsbc.exception.EmployeeAlreadyExistsException;

public class EmployeeDaoArrayImpl implements EmployeeDao {

	private static List<Employee> employees=new ArrayList<Employee>();
	private static int arrayIndexCounter = 0;

	@Override
	public void save(Employee employee){
		employees.add(employee);
		
			}

	@Override
	public Employee fetchEmployeeById(int id) {
		Employee emp=new Employee();
		for(Employee e:employees)
		{
			if(e.getId()==id)
			{
				emp=e;
			}
			
		}
		return emp;

	}

	@Override
	public List<Employee> findAllEmployees() {
		return employees;
		
			}

	@Override
	public void updateEmployee(int id, Employee employee) {
		List<Employee> emp1 = findAllEmployees();
		for(Employee e: emp1) {
			if(e.getId() == id) {
				e = employee;
				break;
			}

	}
}

}

	