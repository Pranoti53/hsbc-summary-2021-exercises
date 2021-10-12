package com.hsbc.service;

import java.util.List;
import java.util.Set;

import com.hsbc.beans.Employee;
import com.hsbc.dao.EmployeeDao;
import com.hsbc.dao.EmployeeDaoArrayImpl;
import com.hsbc.exception.EmployeeAlreadyExistsException;
import com.hsbc.exception.EmployeeNotFoundException;
import com.hsbc.factory.FactoryPattern;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao dao = null;

	public EmployeeServiceImpl() {
		// this is wrong approach we need to use factory pattern
		dao = FactoryPattern.getInstanceOfDao();
	}

	@Override
	public void store(Employee employee) throws EmployeeAlreadyExistsException {
		List<Employee> emp1=dao.findAllEmployees();
		for(Employee e:emp1)
		{
			if(e.getId()==employee.getId())
			{
				throw new EmployeeAlreadyExistsException("This employee already exists!!");
			}
		
			}
		dao.save(employee);
	}

	@Override
	public Employee findEmployee(int id) throws EmployeeNotFoundException {
		Employee emp=dao.fetchEmployeeById(id);
		if(emp==null)
		{
			throw new EmployeeNotFoundException("Sorry Employee details for this ID are not Found!!");
		}
		return emp;
	}
	

	@Override
	public List<Employee> findAllEmployees() {
		return dao.findAllEmployees();
	}

	@Override
	public void updateSalary(int id, double salary) throws EmployeeNotFoundException {
		Employee employee = findEmployee(id);
		employee.setSalary(salary);
		dao.updateEmployee(id, employee);
	}
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     

	@Override
	public void updateName(int id, String name) throws EmployeeNotFoundException {
		Employee employee = findEmployee(id);
		employee.setName(name);
		dao.updateEmployee(id, employee);
	}

	

}
