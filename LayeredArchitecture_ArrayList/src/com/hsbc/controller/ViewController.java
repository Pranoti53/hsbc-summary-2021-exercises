package com.hsbc.controller;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//import java.util.Set;

import com.hsbc.beans.Employee;
import com.hsbc.exception.EmployeeAlreadyExistsException;
//import com.hsbc.exception.EmployeeAlreadyExistsException;
import com.hsbc.exception.EmployeeNotFoundException;
import com.hsbc.factory.FactoryPattern;
import com.hsbc.service.EmployeeService;
//import com.hsbc.service.EmployeeServiceImpl;

public class ViewController {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EmployeeService service =  FactoryPattern.getInstanceOfService();
		int controllerOption = 0;
		do {
			System.out.println("Enter options:-");
			System.out.println(
					"1: Store employee 2: Find employee by id 3: Find All employees 4: Update Name 5: Update Salary 0: Exit");
			controllerOption = scan.nextInt();
			switch (controllerOption) {
			case 1:
				System.out.println("--- Enter employee details ------");
				Employee emp = new Employee();
				System.out.println("Enter id");
				emp.setId(scan.nextInt()); // instead of int id = scan.nextInt(); emp.setId(id);
				System.out.println("Enter name");
				emp.setName(scan.next());
				System.out.println("Enter salary");
				emp.setSalary(scan.nextDouble());
				try {
					service.store(emp);
					System.out.println("Successfully stored.....");
					System.out.println("---------------------------------");
				} catch (EmployeeAlreadyExistsException e3) {
					System.err.println(e3.getMessage());
				}
				
				
				break;
			case 2:
				Employee emp1 = new Employee();
				System.out.println("Enter the required id: ");
				int id = scan.nextInt();
				try {
					Employee emp2 = service.findEmployee(id);
					System.out.println("Employee Details for Entered ID " + emp1.getId() + " is: " + emp2);
				} catch (EmployeeNotFoundException e2) {
					System.err.println(e2.getMessage());				
					}
				break;

			case 3:
				List<Employee> employees = service.findAllEmployees();
				Collections.sort(employees);
				for (Employee e : employees) {
					System.out.println("Hello " + e.getName() + ", Your salary is: " + e.getSalary() + " and id is : "
							+ e.getId());
				}
				break;
			case 4:
				Employee emp3 = new Employee();
				System.out.println("Enter the required id: ");
				int id1 = scan.nextInt();
				System.out.println("Enter the name to be changed: ");
				String name = scan.next();
				try {
					service.updateName(id1, name);
					System.out.println("Details are updated!!!");
				} catch (EmployeeNotFoundException e1) {
					
					System.err.println(e1.getMessage());
				}
				break;
			case 5:
				Employee emp5 = new Employee();
				System.out.println("Enter the required id: ");
				int id2 = scan.nextInt();
				System.out.println("Enter the salary to be changed: ");
				double salary = scan.nextDouble();
				try {
					service.updateSalary(id2, salary);
					System.out.println("Details are updated!!");
				} catch (EmployeeNotFoundException e1) {
					System.err.println(e1.getMessage());
				}
				break;
			}
		} while (controllerOption != 0);
		scan.close();
	}

}
