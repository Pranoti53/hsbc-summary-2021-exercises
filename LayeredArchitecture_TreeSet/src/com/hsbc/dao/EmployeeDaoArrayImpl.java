package com.hsbc.dao;

import java.util.Set;
import java.util.TreeSet;

import com.hsbc.beans.Employee;
//import com.hsbc.exception.EmployeeAlreadyExistsException;

public class EmployeeDaoArrayImpl implements EmployeeDao {

	private static Set<Employee> employees=new TreeSet<Employee>();
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
	public Set<Employee> findAllEmployees() {
		return employees;
		
			}

	@Override
	public void updateEmployee(int id, Employee employee) {
		Set<Employee> emp1 = findAllEmployees();
		for(Employee e: emp1) {
			if(e.getId() == id) {
				e = employee;
				break;
			}

	}
}

}

	