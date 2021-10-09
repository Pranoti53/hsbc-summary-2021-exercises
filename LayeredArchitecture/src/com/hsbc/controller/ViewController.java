package com.hsbc.controller;

import java.util.Scanner;

import com.hsbc.beans.Employee;
import com.hsbc.service.EmployeeService;
import com.hsbc.service.EmployeeServiceImpl;

public class ViewController {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EmployeeService service = new EmployeeServiceImpl();
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
				service.store(emp);
				System.out.println("Successfully stored.....");
				System.out.println("---------------------------------");
				break;
			case 2:
				Employee emp1 = new Employee();
				System.out.println("Enter the required id: ");
				int id = scan.nextInt();
				Employee emp2 = service.findEmployee(id);
				System.out.println("Employee Details for Entered ID " + emp1.getId() + " is: " + emp2);
				break;

			case 3:
				Employee[] employees = service.findAllEmployees();
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
				Employee emp4 = service.updateName(id1, name);
				System.out.println("Updated Employee Details of employee having id: " + id1 + " are: " + emp4);

				break;
			case 5:
				Employee emp5 = new Employee();
				System.out.println("Enter the required id: ");
				int id2 = scan.nextInt();
				System.out.println("Enter the salary to be changed: ");
				double salary = scan.nextDouble();
				Employee emp6 = service.updateSalary(id2, salary);
				System.out.println("Updated Employee Details of employee having id: " + id2 + " are: " + emp6);
				break;
			}
		} while (controllerOption != 0);
		scan.close();
	}

}
